
package com.rayzr522.hubportals;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class HPListener implements Listener {

	@SuppressWarnings("unused")
	private HubPortals plugin;

	public HPListener(HubPortals plugin) {

		this.plugin = plugin;

	}

	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e) {

	}

}
