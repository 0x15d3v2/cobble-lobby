package net.artren.cobble.events;

import net.artren.cobble.Cobble;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class PlayerChat implements Listener {
    @EventHandler
    public void onChat(PlayerChatEvent e) {
        e.setCancelled(Cobble.getPlugin(Cobble.class).getConfig().getBoolean("disable-chatting"));
    }
}
