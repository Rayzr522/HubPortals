
package com.rayzr522.hubportals.utils;

import java.util.Collection;

import org.bukkit.ChatColor;

public class TextUtils {

    public static final char COLOR_CHAR = '&';

    public static String listToString(Collection<? extends Object> list) {

        StringBuilder output = new StringBuilder("");

        for (Object o : list) {

            output.append(", " + o.toString());

        }

        return output.substring(2);

    }

    public static String camelCase(String input) {

        if (input.equals(null) || input.equals("")) {

            return "";

        }

        String lowerInput = input.toLowerCase();

        String output = "";

        String[] words = lowerInput.split("_|-| ");

        if (words.length <= 1) {

            return lowerInput;

        }

        output += words[0];

        for (int i = 1; i < words.length; i++) {

            output += firstLetterToUpperCase(words[i]);

        }

        return output;

    }

    public static String firstLetterToLowerCase(String input) {

        if (input.equals(null) || input.equals("")) {

            return "";

        }

        if (input.length() == 1) {

            return input.toLowerCase();

        }

        String output = "";

        input = input.trim();

        String[] letters = input.split("");

        output += letters[1].toLowerCase();

        for (int i = 2; i < letters.length; i++) {

            output += letters[i];

        }

        return output;

    }

    public static String firstLetterToUpperCase(String input) {

        if (input.equals(null) || input.equals("")) {

            return "";

        }

        if (input.length() == 1) {

            return input.toUpperCase();

        }

        String output = "";

        input = input.trim();

        String[] letters = input.split("");

        output += letters[1].toUpperCase();

        for (int i = 2; i < letters.length; i++) {

            output += letters[i];

        }

        return output;

    }

    public static String color(String input) {

        return input == null ? null : ChatColor.translateAlternateColorCodes(TextUtils.COLOR_CHAR, input);

    }

    public static String reverseColor(String input) {

        return input == null ? null : input.replace(ChatColor.COLOR_CHAR, TextUtils.COLOR_CHAR);

    }

    public static boolean equalsLowerCase(String string, String string2) {
        return ((string == null || string2 == null) ? false : string.toLowerCase().equals(string2.toLowerCase()));
    }

    public static String enumFormat(String text) {

        return text.trim().toUpperCase().replace(" ", "_");

    }

}
