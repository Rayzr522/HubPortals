
package com.rayzr522.hubportals.data;

public class Classes {

    public static boolean impl(Object obj, Class<?> intrface) {

        for (Class<?> claz : obj.getClass().getInterfaces()) {

            if (claz.isAssignableFrom(intrface)) {

                return true;

            }

        }

        return false;

    }

}
