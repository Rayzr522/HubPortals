
package com.rayzr522.hubportals.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bukkit.configuration.serialization.ConfigurationSerializable;

public class Serializer {

	public static <T extends ConfigurationSerializable> List<Map<String, Object>> list(List<T> list) {
		
		List<Map<String, Object>> output = new ArrayList<Map<String, Object>>();

		if (list == null) {

		return null;

		}

		for (T item : list) {

			output.add(item.serialize());

		}

		return output;
		
	}

}
