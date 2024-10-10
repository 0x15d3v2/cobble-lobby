package net.artren.cobble.events;

import net.artren.cobble.Cobble;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {
    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        e.setCancelled(Cobble.getPlugin(Cobble.class).getConfig().getBoolean("disable-move"));
    }
}
