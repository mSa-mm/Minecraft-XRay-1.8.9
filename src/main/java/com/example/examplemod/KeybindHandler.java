package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Keyboard;

public class KeybindHandler {

    public static KeyBinding xrayKey;
    public static boolean isXRayEnabled = false;

    public static void init() {
        xrayKey = new KeyBinding("Toggle X-Ray", Keyboard.KEY_X, "Cheats");
        ClientRegistry.registerKeyBinding(xrayKey);
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.END
                && Minecraft.getMinecraft().thePlayer != null
                && xrayKey.isPressed()) {
            isXRayEnabled = !isXRayEnabled;
            Minecraft minecraft = Minecraft.getMinecraft();
            minecraft.renderGlobal.loadRenderers();
            minecraft.thePlayer.addChatMessage(
                new ChatComponentText("X-Ray: " + (isXRayEnabled ? "§aENABLED" : "§cDISABLED"))
            );
        }
    }
}
