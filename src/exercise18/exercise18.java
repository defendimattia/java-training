package exercise18;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class exercise18 {

    private static boolean checkConditions(int num, int[] array) {

        int[] arrayInt = String.valueOf(num).chars().map(c -> c - '0').toArray();

        boolean digitFollowedByZeros = Integer
                .parseInt(new StringBuilder(String.valueOf(num)).reverse().toString()) < 10;

        boolean allSameDigitCheck = String.valueOf(num).chars().map(c -> c - '0').boxed()
                .collect(Collectors.toSet()).size() == 1;

        boolean incrementalCheck = IntStream.range(0, arrayInt.length - 1)
                .allMatch(i -> arrayInt[i + 1] == (arrayInt[i] + 1) % 10);

        boolean decrementalCheck = IntStream.range(0, arrayInt.length - 1)
                .allMatch(i -> arrayInt[i + 1] == arrayInt[i] - 1);

        boolean palindromeCheck = String.valueOf(num).equals(new StringBuilder(String.valueOf(num)).reverse()
                .toString());

        boolean sameNumsCheck = Arrays.stream(array).anyMatch(n -> n == num);

        return digitFollowedByZeros || allSameDigitCheck || incrementalCheck || decrementalCheck || palindromeCheck
                || sameNumsCheck;
    }

    public static int isInteresting(int number, int[] awesomePhrases) {

        if (number > 99) {

            if (checkConditions(number, awesomePhrases))
                return 2;

            if (checkConditions(number + 1, awesomePhrases))
                return 1;

            if (checkConditions(number + 2, awesomePhrases))
                return 1;

            if (checkConditions(number - 1, awesomePhrases))
                return 1;

            if (checkConditions(number - 2, awesomePhrases))
                return 1;

            return 0;

        } else if (number == 98 || number == 99) {
            return 1;
        } else {
            return 0;
        }
    }
}
