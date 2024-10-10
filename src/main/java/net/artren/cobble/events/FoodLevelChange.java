package net.artren.cobble.events;

import net.artren.cobble.Cobble;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodLevelChange implements Listener {
    @EventHandler
    public void onFood(FoodLevelChangeEvent e) {
        e.setCancelled(Cobble.getPlugin(Cobble.class).getConfig().getBoolean("disable-hungry"));
        e.setFoodLevel(20);
    }
}
