package kukulam.module.testing.level.C;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

class StringHandler {

    /**
     * Create new array with objects from array a and array b.
     * @return Array with strings.
     */
    String[] add(String[] a, String[] b) {
        String[] result = Arrays.copyOf(a, a.length + b.length);

        for(int i = a.length, j=0; i < result.length; i++, j++) {
            result[i] = b[j];
        }

        return result;
    }

    /**
     * Create string from given objects.
     * @return String or null when arguments are not provided.
     */
    String create(String... arguments) {
        if (arguments.length == 0)
            return null;

        StringBuilder result = new StringBuilder(arguments[0]);

        for (int i = 1; i < arguments.length; i++) {
            result.append(arguments[i]);
        }

        return result.toString();
    }

    /**
     * Create new array with upper case or lower case characters from given string.
     * @return Array with strings.
     */
    String[] convert(String text, boolean upperCase) {
        if (text == null)
            return new String[0];

        if (upperCase) {
            return text.toUpperCase().split("");
        } else {
            return text.toLowerCase().split("");
        }
    }
}


