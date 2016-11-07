
package com.rayzr522.hubportals.data;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.configuration.serialization.ConfigurationSerializable;

import com.rayzr522.hubportals.utils.TextUtils;

public class PortalAction implements ConfigurationSerializable {

    private Type   type;
    private String data;

    public PortalAction(Type type, String data) {

        this.type = type;
        this.data = data;

    }

    public void execute() {

    }

    public enum Type {

        POSITION,
        COMMAND;

        public static Type get(String input) {

            try {
                return valueOf(TextUtils.enumFormat(input));
            } catch (Exception e) {
                return null;
            }

        }

    }

    @Override
    public Map<String, Object> serialize() {

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("type", type.toString());
        map.put("data", data);

        return map;

    }

    public static PortalAction deserialize(Map<String, Object> map) {

        if (!map.containsKey("type")) {
            throw new IllegalArgumentException("Invalid data map (missing \"type\" key)");
        }
        if (!map.containsKey("data")) {
            throw new IllegalArgumentException("Invalid data map (missing \"data\" key)");
        }

        Type type = Type.get(map.get("type").toString());
        if (type == null) {
            throw new IllegalArgumentException("Invalid data map (the \"type\" key is invalid)");
        }
        String data = map.get("data").toString();

        return new PortalAction(type, data);

    }

}
