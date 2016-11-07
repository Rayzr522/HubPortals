
package com.rayzr522.hubportals;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class HubPortals extends JavaPlugin {

    private Logger logger;

    @Override
    public void onEnable() {

        logger = getLogger();

        getServer().getPluginManager().registerEvents(new HPListener(this), this);

        logger.info(getName() + " v" + getVersion() + " has been enabled");

    }

    @Override
    public void onDisable() {

        logger.info(getName() + " v" + getVersion() + " has been disabled");

    }

    public String getVersion() {

        return getDescription().getVersion();

    }

}
