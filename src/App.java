import java.util.Arrays;

import exercise1.exercise1;
import exercise2.exercise2;
import exercise3.exercise3;
import exercise4.exercise4;
import exercise5.exercise5;
import exercise6.exercise6;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(exercise1.stringToNums("The narwhal bacons at midnight."));
        System.out.println(exercise2.toCamelCase("the-Stealth-Warrior"));
        System.out.println(Arrays.toString(exercise3.solution("abcde")));
        System.out.println(exercise4.rot13("Test"));
        System.out.println(exercise5.incrementString("Y;wjw\\Mq|~.muJ@G!iE:6TR`?t62732582231021"));
        System.out.println(exercise6.scramble("aabbcamaomsccdd", "commas"));

    }
}
