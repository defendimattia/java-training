package exercise16;

import java.util.Arrays;

public class exercise16 {

    public static boolean isNarcissistic(int number) {

        String numStr = String.valueOf(number);
        int[] nums = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            nums[i] = numStr.charAt(i) - '0';
        }

        return Arrays.stream(nums)
                .map(n -> (int) Math.pow(n, nums.length))
                .sum() == number;
    }

}
