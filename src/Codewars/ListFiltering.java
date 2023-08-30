package Codewars;

import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(e -> !e.equals(e.toString())).toList();
    }
}
