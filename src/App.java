import java.util.Arrays;

import exercise1.exercise1;
import exercise10.exercise10;
import exercise11.exercise11;
import exercise12.exercise12;
import exercise13.exercise13;
import exercise2.exercise2;
import exercise3.exercise3;
import exercise4.exercise4;
import exercise5.exercise5;
import exercise6.exercise6;
import exercise7.exercise7;
import exercise8.exercise8;
import exercise9.exercise9;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println(exercise1.stringToNums("The narwhal bacons at midnight."));
        System.out.println(exercise2.toCamelCase("the-Stealth-Warrior"));
        System.out.println(Arrays.toString(exercise3.solution("abcde")));
        System.out.println(exercise4.rot13("Test"));
        System.out.println(exercise5.incrementString("Y;wjw\\Mq|~.muJ@G!iE:6TR`?t62732582231021"));
        System.out.println(exercise6.scramble("aabbcamaomsccdd", "commas"));
        System.out.println(exercise7.formatDuration(6087600));
        System.out.println(exercise8.makeReadable(39999));
        System.out.println(Arrays.toString(exercise9.dirReduc(new String[] { "SOUTH", "SOUTH"})));
        System.out.println(exercise10.alphanumeric("dhuehurehf74!hfwhd"));
        System.out.println(exercise11.rangeExtraction(
                new int[] {-51, -50, -49, -48, -45, -42, -40, -38, -36, -33, -31, -30, -28, -25, -24, -23, -21, -20, -18, -15, -12, -11, -8, -5, -3, 0, 1, 2, 5, 6, 7}));
        System.out.println(exercise12.stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));
        System.out.println(exercise13.sumStrings("00103", "08567"));
    }
}
