
package com.rayzr522.hubportals;

import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;

public class Direction {

	/**
	 * Only effective for North, West, East and South
	 * 
	 * @param input
	 * @return
	 */
	public BlockFace parallel(BlockFace input) {

		if (input == BlockFace.NORTH || input == BlockFace.SOUTH) {
			return BlockFace.WEST;
		} else if (input == BlockFace.EAST || input == BlockFace.WEST) {
			return BlockFace.NORTH;
		} else {
			return input;
		}

	}

	public BlockFace getFlat(Player player) {

		int direction = (int) Math.round(player.getLocation().getYaw() / 90.0);

		switch (direction) {

		case 1:
			return BlockFace.WEST;
		case 2:
			return BlockFace.NORTH;
		case 3:
			return BlockFace.EAST;
		default:
			return BlockFace.SOUTH;

		}

	}

}
