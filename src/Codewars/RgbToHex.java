package Codewars;

// https://www.codewars.com/kata/513e08acc600c94f01000001/train/java
public class RgbToHex {
    public static String convert(int r, int g, int b) {
        return String.format("%s%s%s",
                HexString(r).length() == 1 ? "0" + HexString(r) : HexString(r),
                HexString(g).length() == 1 ? "0" + HexString(g) : HexString(g),
                HexString(b).length() == 1 ? "0" + HexString(b) : HexString(b)).toUpperCase();
    }

    private static String HexString(int color) {
        return Integer.toHexString(color > 0 ? Math.min(color, 255) : 0);
    }
}
