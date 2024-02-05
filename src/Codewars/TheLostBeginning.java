package Codewars;

public class TheLostBeginning {
    public static void main(String[] args) {
        System.out.println("Correct is 12412512, get: " + getNumber("12412512"));
    }

    public static long getNumber(String stringOfDigits) {
        if (!stringOfDigits.matches("\\d+"))
            return -1;

        long smallestNumber = -1;
        int countOfDigits = stringOfDigits.length();

        long currentNumber;
        long expectedNextNumber = 0;
        int lengthOfNextNumber;

        boolean flag = true;

        for (int i = 1; i <= countOfDigits / 2; i++) {
            lengthOfNextNumber = i;
            for (int j = 0; j + lengthOfNextNumber <= countOfDigits; ) {
                currentNumber = Long.parseLong(stringOfDigits.substring(j, j + lengthOfNextNumber));
                if (j == 0) {
                    smallestNumber = currentNumber;
                } else if (expectedNextNumber != currentNumber) {
                    flag = true;
                    break;
                }
                expectedNextNumber = currentNumber + 1;
                j += lengthOfNextNumber;
                lengthOfNextNumber += String.valueOf(expectedNextNumber).length() - String.valueOf(currentNumber).length();
                if (j + lengthOfNextNumber == countOfDigits)
                    flag = false;
            }
            if (!flag)
                break;

            smallestNumber = -1;
        }

        if (smallestNumber == -1)
            smallestNumber = countOfDigits <= 9 ? Long.parseLong(stringOfDigits) : -1;

        return smallestNumber > 1000000000 || smallestNumber < 1 ? -1 : smallestNumber;
    }

}
