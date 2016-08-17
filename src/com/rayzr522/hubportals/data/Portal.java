
package com.rayzr522.hubportals.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.util.Vector;

public class Portal implements ConfigurationSerializable {

	private static final String	INVALID_FACE	= "!!! INVALID FACE !!!";

	private World				world;
	private List<Vector>		blockPositions	= new ArrayList<Vector>();
	private PortalAction		action;
	private BlockFace			face;

	public Portal(World world, List<Vector> blockPositions, PortalAction action, BlockFace face) {

		this.world = world;
		this.blockPositions = blockPositions;

		this.action = action;
		this.face = face;

	}

	public void execute() {

		action.execute();

	}

	public World getWorld() {
		return world;
	}

	public List<Vector> getBlockPositions() {
		return blockPositions;
	}

	public PortalAction getAction() {
		return action;
	}

	@Override
	public Map<String, Object> serialize() {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("world", world.getUID().toString());
		map.put("blockPositions", Serializer.<Vector> list(blockPositions));
		map.put("action", action.serialize());

		if (face == BlockFace.SOUTH) {

			map.put("face", "NS");

		} else if (face == BlockFace.WEST) {

			map.put("face", "EW");

		} else {

			map.put("face", INVALID_FACE);

		}

		return map;
	}

	public static Portal deserialize(Map<String, Object> map) {

		if (!map.containsKey("world")) { throw new IllegalArgumentException("Invalid data map (missing \"world\" key)"); }
		if (!map.containsKey("blockPositions")) { throw new IllegalArgumentException("Invalid data map (missing \"BlockPositions\" key)"); }
		if (!map.containsKey("action")) { throw new IllegalArgumentException("Invalid data map (missing \"action\" key)"); }

		World world = Bukkit.getWorld(UUID.fromString((String) map.get("world")));
		if (world == null) {
			System.err.println("Could not load world with UUID '" + map.get("world") + "'");

		}

		// BlockPositions =
		// Portal portal = new Portal(world, blockPositions, action, face);
		return null;

	}

}
