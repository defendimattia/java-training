import java.util.Arrays;

import exercise1.exercise1;
import exercise2.exercise2;
import exercise3.exercise3;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(exercise1.stringToNums("The narwhal bacons at midnight."));
        System.out.println(exercise2.toCamelCase("the-Stealth-Warrior"));
        System.out.println(Arrays.toString(exercise3.solution("abcde")));

    }
}
