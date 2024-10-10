package net.artren.cobble.events;

import net.artren.cobble.Cobble;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener {
    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        if(Cobble.getPlugin(Cobble.class).getConfig().getBoolean("disable-join-messages")){
        e.quitMessage(Component.text(""));
        }
    }
}
