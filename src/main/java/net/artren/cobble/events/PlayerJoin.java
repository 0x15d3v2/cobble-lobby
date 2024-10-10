package net.artren.cobble.events;

import net.artren.cobble.Cobble;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    private Location spawn = Cobble.getPlugin(Cobble.class).getConfig().getLocation("spawn");

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().teleport(spawn);
        Bukkit.getOnlinePlayers().forEach((p) -> {
            e.getPlayer().hidePlayer(p);
        });


        if(Cobble.getPlugin(Cobble.class).getConfig().getBoolean("disable-join-messages")) {
            e.joinMessage(Component.text(""));
        }

        e.getPlayer().setGameMode(GameMode.ADVENTURE);
        e.getPlayer().sendMessage(Cobble.getPlugin(Cobble.class).getConfig().getString("join-message") != null ? Cobble.getPlugin(Cobble.class).getConfig().getString("join-message") : "Hello, this is the default message for CobbleLobi. You can change this in your config.yml.");
        e.getPlayer().playSound(e.getPlayer(), Sound.ENTITY_PLAYER_LEVELUP, 1f, 1f);
    }
}
