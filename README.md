# Simple 1.8.9 X-Ray Mod

A lightweight, client-side X-Ray mod for Minecraft 1.8.9 built using Forge and Mixin.

This project was created as a learning exercise to understand the fundamentals of Minecraft game hacking, Mixin injection, and Forge event handling.

## Features

*   **Toggleable X-Ray:** Press `X` to toggle the X-Ray on and off.
*   **Ore Filtering:** Hides all standard blocks (stone, dirt, etc.) while leaving ores, diamonds, emeralds, and chests visible.
*   **In-Game Feedback:** Displays a chat message when toggled on or off.

## Requirements

*   **Minecraft Version:** 1.8.9
*   **Mod Loader:** Minecraft Forge (11.15.1.2318 or similar)
*   **Java:** JDK 8 (Required for building)

## Building from Source

1.  Ensure you have **JDK 8** installed and set as your `JAVA_HOME`.
2.  Clone the repository:
    ```bash
    git clone https://github.com/mSa-mm/Minecraft-XRay-1.8.9
3. Open the project folder in your terminal or IDE (VS Code, IntelliJ, etc.).
4. Build the mod using Gradle: gradlew build or ./gradlew build
5. The compiled .jar file will be located in build/libs/(e.g., examplemod-1.0.jar).

Installation

    Install Minecraft Forge for 1.8.9 .

    Locate your .minecraft/mods folder.

    Drop the compiled .jar file into the mods folder.

    Launch the game using the Forge 1.8.9 profile.

Usage

    Join a single-player world or a private server (ensure the server version is 1.8.9).

    Press X to enable X-Ray.

    Press X again to disable it.

⚠️ Disclaimer

    This mod is intended for educational purposes and for use on private servers where you have permission.

    Using X-Ray on public servers (like Hypixel or other large networks) is considered cheating and will likely result in a ban.

    This mod will not work on servers that use Anti-Xray plugins (like Orebfuscator), as the server will send fake block data to your client.

    The author is not responsible for any bans or consequences resulting from the use of this mod.
