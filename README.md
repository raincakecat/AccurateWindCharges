# AccurateWindCharges

AccurateWindCharges removes the random launch spread from player-thrown wind charges. Their launch direction follows the player's aim, while preserving the projectile's launch speed.

## Installation

Download the JAR labeled for your Paper server version from [Releases](https://github.com/raincakecat/AccurateWindCharges/releases), put it in your server's `plugins` folder, and restart the server. Use only one of the three JARs; they contain the same plugin.

Paper 1.21.11, 26.2, and 26.3 were tested with six actual player-initiated wind charge throws on each server, across horizontal and steep upward and downward angles. A server-side observer verified that each launch velocity matched the player's aim. The 26.2 and 26.3 tests used an older test client through ViaVersion and ViaBackwards. Impact accuracy and interoperability with other gameplay plugins were not tested.

## Build

With JDK 21 or newer and Maven installed, run `mvn package`. The resulting JAR is in `target/`.

## License

The plugin is source-available under the use-only terms in [LICENSE](LICENSE). The icon includes a Minecraft texture belonging to Mojang Studios and is subject to its own applicable terms. This project is not an official Minecraft product and is not affiliated with Mojang Studios.

## AI disclosure

The plugin code, build configuration, documentation, and icon composition were created with AI assistance. The wind charge texture in the icon comes from Minecraft.

