package Codewars;

import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        // need to use "instanceof"
        return list.stream().filter(e -> e instanceof Integer).toList();
    }
}
