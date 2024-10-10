package net.artren.cobble.events;

import net.artren.cobble.Cobble;
import net.kyori.adventure.text.Component;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerInteract implements Listener {
    @EventHandler
    public void onQuit(PlayerInteractEvent e) {
        e.setCancelled(Cobble.getPlugin(Cobble.class).getConfig().getBoolean("disable-interacting"));
    }
}
