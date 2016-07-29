
package com.rayzr522.hubportals;

import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class HPListener implements Listener {

	@SuppressWarnings("unused")
	private HubPortals plugin;

	public HPListener(HubPortals plugin) {

		this.plugin = plugin;

	}

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e) {

		if (e.getBlock().getType() == Material.WOOL && e.getBlock().getData() == (byte) 10) {

			e.setCancelled(true);

			BlockState state = e.getBlock().getState();

			state.setType(Material.PORTAL);

			state.update(true, false);

		}

	}

}
