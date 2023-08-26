package Codewars;

// https://www.codewars.com/kata/54ba84be607a92aa900000f1/train/java

/*
 * An isogram is a word that has no repeating letters,
 * consecutive or non-consecutive.
 * "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
 * */
public class IsIsogram {
    public static boolean check(String str) {
        if (str == null)
            throw new NullPointerException("String is null!");
        if (str.isEmpty())
            return true;
        return str.toLowerCase().chars().distinct().count() == str.toLowerCase().chars().count();
    }
}
