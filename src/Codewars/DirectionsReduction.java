package Codewars;

import java.util.Arrays;
import java.util.LinkedList;

// https://www.codewars.com/kata/550f22f4d758534c1100025a/train/java

public class DirectionsReduction {
    public static String[] dirReduc(String[] arr) {
        if (arr == null)
            return null;
        if (arr.length == 0)
            return arr;
        LinkedList<String> list = new LinkedList<>(Arrays.asList(arr));

        while (canChangeDirection(list)) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (isDirectionsReduction(list.get(i), list.get(i + 1))) {
                    list.remove(i);
                    list.remove(i);
                    break;
                }
            }
        }

        return castToArray(list);
    }

    public static String[] castToArray(LinkedList<String> list) {
        int i = 0;
        String[] result = new String[list.size()];

        for (String str : list) {
            result[i++] = str;
        }
        return result;
    }

    public static boolean canChangeDirection(LinkedList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (isDirectionsReduction(list.get(i), list.get(i + 1)))
                return true;
        }
        return false;
    }

    public static boolean isDirectionsReduction(String dir1, String dir2) {
        return dir1.equals("WEST") && dir2.equals("EAST") ||
                dir1.equals("EAST") && dir2.equals("WEST") ||
                dir1.equals("SOUTH") && dir2.equals("NORTH") ||
                dir1.equals("NORTH") && dir2.equals("SOUTH");
    }
}
