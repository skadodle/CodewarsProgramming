package Codewars;

// https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/train/java

/*
 * Codewars.RangeExtraction.solution(new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
 * returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
 * */
public class RangeExtraction {
    public static String solution(int[] numbers) {
        if (numbers == null)
            return null;
        if (numbers.length == 0)
            return "";

        String result = "";
        boolean flag = false;
        int counter = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (flag) {
                if (Math.abs(numbers[i] - numbers[i - 1]) == 1) {
                    counter++;
                } else {
                    if (counter >= 3)
                        result += "," + numbers[i - counter] + "-" + numbers[i - 1];
                    else if (counter == 2) {
                        result += "," + numbers[i - 2] + "," + numbers[i - 1];
                    } else {
                        result += "," + numbers[i - 1];
                    }
                    counter = 1;
                    flag = false;
                }
            } else {
                if (Math.abs(numbers[i] - numbers[i - 1]) == 1) {
                    flag = true;
                    counter++;
                } else {
                    result += "," + numbers[i - 1];
                }
            }
        }
        if (counter >= 3)
            result += "," + numbers[numbers.length - counter] + "-" + numbers[numbers.length - 1];
        else if (counter == 2) {
            result += "," + numbers[numbers.length - 2] + "," + numbers[numbers.length - 1];
        } else {
            result += "," + numbers[numbers.length - 1];
        }
        return result.substring(1);
    }
}