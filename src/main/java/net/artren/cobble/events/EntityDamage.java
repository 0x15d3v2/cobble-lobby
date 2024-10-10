package net.artren.cobble.events;

import net.artren.cobble.Cobble;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamage implements Listener {
    @EventHandler
    public void onDamage(EntityDamageEvent e) {
        e.setCancelled(Cobble.getPlugin(Cobble.class).getConfig().getBoolean("disable-damage"));
    }
}
