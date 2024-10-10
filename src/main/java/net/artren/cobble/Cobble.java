package net.artren.cobble;

import net.artren.cobble.events.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Cobble extends JavaPlugin {
    Logger logger = getLogger();

    @Override
    public void onEnable() {
        saveDefaultConfig();
        registerEvents();
        logBanner();
    }

    @Override
    public void onDisable() {
    }

    public void registerEvents(){
        Bukkit.getServer().getPluginManager().registerEvents(new EntityDamage(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new FoodLevelChange(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerChat(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerInteract(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerMove(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
    }

    public void logBanner() {
        logger.info("");
        logger.info(" ██████╗ ██╗   ██╗██╗██╗  ████████╗");
        logger.info("██╔═══██╗██║   ██║██║██║  ╚══██╔══╝");
        logger.info("██║   ██║██║   ██║██║██║     ██║   ");
        logger.info("██║▄▄ ██║██║   ██║██║██║     ██║   ");
        logger.info("╚██████╔╝╚██████╔╝██║███████╗██║   ");
        logger.info(" ╚══▀▀═╝  ╚═════╝ ╚═╝╚══════╝╚═╝   ");
        logger.info("");
    }
}
