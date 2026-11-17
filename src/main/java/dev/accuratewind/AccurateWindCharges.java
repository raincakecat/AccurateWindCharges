package dev.accuratewind;

import org.bukkit.entity.Player;
import org.bukkit.entity.WindCharge;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public final class AccurateWindCharges extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onLaunch(ProjectileLaunchEvent event) {
        if (!(event.getEntity() instanceof WindCharge charge)
                || !(charge.getShooter() instanceof Player player)) return;
        double speed = charge.getVelocity().length();
        if (speed <= 0 || !Double.isFinite(speed)) return;
        Vector direction = player.getEyeLocation().getDirection();
        charge.setVelocity(direction.normalize().multiply(speed));
    }
}
