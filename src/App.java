import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import exercise1.exercise1;
import exercise10.exercise10;
import exercise11.exercise11;
import exercise12.exercise12;
import exercise13.exercise13;
import exercise14.exercise14;
import exercise15.exercise15;
import exercise16.exercise16;
import exercise17.exercise17;
import exercise18.exercise18;
import exercise19.exercise19;
import exercise2.exercise2;
import exercise20.VigenereCipher;
import exercise21.exercise21;
import exercise3.exercise3;
import exercise30.exercise30;
import exercise31.exercise31;
import exercise32.exercise32;
import exercise33.exercise33;
import exercise34.exercise34;
import exercise35.exercise35;
import exercise36.exercise36;
import exercise37.exercise37;
import exercise38.exercise38;
import exercise39.exercise39;
import exercise4.exercise4;
import exercise40.exercise40;
import exercise41.exercise41;
import exercise42.exercise42;
import exercise43.exercise43;
import exercise44.exercise44;
import exercise45.exercise45;
import exercise46.exercise46;
import exercise47.exercise47;
import exercise48.exercise48;
import exercise49.exercise49;
import exercise5.exercise5;
import exercise50.exercise50;
import exercise51.exercise51;
import exercise52.exercise52;
import exercise53.exercise53;
import exercise54.exercise54;
import exercise55.exercise55;
import exercise56.exercise56;
import exercise57.exercise57;
import exercise58.exercise58;
import exercise59.exercise59;
import exercise6.exercise6;
import exercise60.exercise60;
import exercise61.exercise61;
import exercise62.exercise62;
import exercise63.exercise63;
import exercise64.exercise64;
import exercise65.exercise65;
import exercise66.exercise66;
import exercise67.exercise67;
import exercise68.exercise68;
import exercise69.exercise69;
import exercise7.exercise7;
import exercise70.exercise70;
import exercise71.exercise71;
import exercise72.exercise72;
import exercise73.exercise73;
import exercise74.exercise74;
import exercise75.exercise75;
import exercise76.exercise76;
import exercise77.exercise77;
import exercise78.exercise78;
import exercise79.exercise79;
import exercise8.exercise8;
import exercise9.exercise9;
import exercise22.exercise22;
import exercise23.exercise23;
import exercise25.exercise25;
import exercise26.exercise26;
import exercise27.exercise27;
import exercise28.exercise28;
import exercise29.exercise29;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println(exercise1.stringToNums("The narwhal bacons at
        // midnight."));
        // System.out.println(exercise2.toCamelCase("the-Stealth-Warrior"));
        // System.out.println(Arrays.toString(exercise3.solution("abcde")));
        // System.out.println(exercise4.rot13("Test"));
        // System.out.println(exercise5.incrementString("Y;wjw\\Mq|~.muJ@G!iE:6TR`?t62732582231021"));
        // System.out.println(exercise6.scramble("aabbcamaomsccdd", "commas"));
        // System.out.println(exercise7.formatDuration(6087600));
        // System.out.println(exercise8.makeReadable(39999));
        // System.out.println(Arrays.toString(exercise9.dirReduc(new String[] { "SOUTH",
        // "SOUTH"})));
        // System.out.println(exercise10.alphanumeric("dhuehurehf74!hfwhd"));
        // System.out.println(exercise11.rangeExtraction(
        // new int[] {-51, -50, -49, -48, -45, -42, -40, -38, -36, -33, -31, -30, -28,
        // -25, -24, -23, -21, -20, -18, -15, -12, -11, -8, -5, -3, 0, 1, 2, 5, 6, 7}));
        // System.out.println(exercise12.stripComments("apples, pears # and
        // bananas\ngrapes\nbananas !apples", new String[] { "#", "!" }));
        // System.out.println(exercise13.sumStrings("00103", "08567"));
        // System.out.println(exercise14.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb
        // cc cC e e e"));
        // System.out.println(exercise16.isNarcissistic(153));
        // System.out.println(Arrays.toString(exercise17.isPerfectPower(8)));
        // System.out.println(exercise18.isInteresting(1232, new int[] {}));
        // System.out.println(exercise19.mix("Are they here", "yes, they are here"));
        // VigenereCipher testing = new VigenereCipher("abcdefghijklmnopqrstuvwxyz",
        // "password");
        // System.out.println(testing.encode("hello mondo"));
        // System.out.println(exercise21.sequence(new int[] { -2, 1, -3, 4, -1, 2, 1,
        // -5, 4 }));
        // System.out.println(exercise22.greedy(new int[] { 6,6,6,3,3}));
        // System.out.println(exercise25.findMissingLetter(new char[]
        // {'L','M','N','O','P','R','S'}));
        // System.out.println(exercise26.workOnStrings("abc", "cde"));
        // System.out.println(exercise27.rgb(265, 134, 50));
        // System.out.println(Arrays.toString(exercise28.productFib(714)));
        // System.out.println(exercise29.firstNonRepeatingLetter("sTreSS"));
        // System.out.println(exercise30.orderWeight("103 123 4444 99 2000"));
        // System.out.println(exercise31.isSolved(new int[][] { { 0, 0, 0 }, { 0, 1, 0
        // }, { 0, 0, 2 } }));
        // exercise32.removNb(50).forEach(arr ->
        // System.out.println(Arrays.toString(arr)));
        // System.out.println(Arrays.toString(
        // exercise33.flapDisplay(new String[] { "HELLO " }, new int[][] { { 15, 49, 50,
        // 48, 43, 13 } })));
        // System.out.println(exercise34.factors(7775460));
        // System.out.println(exercise35.sumIntervals(new int[][] { { -2, -1 }, { -1, 0
        // }, { 0, 21 } }));
        // System.out.println(exercise36.zeros(12));
        // System.out.println(Arrays.toString(exercise37.tribonacci(new double[] { 4.0,
        // 8.0, 7.0 }, 1)));
        // System.out.println(exercise38.decode(".... . -.-- .--- ..- -.. ."));
        // System.out.println(exercise39.singlePermutations("aabb"));
        // System.out.println(
        // exercise40.draw(Arrays.asList(new String[] { "KC", "KH", "QC", "KS", "KD",
        // "QH", "QD", "QS" })));
        // System.out.println(exercise41.compute(18, 48));
        // System.out.println(Arrays.toString(exercise42.myFraction(new int[] {60,
        // 20})));
        // System.out.println(exercise43.setReducer(
        // new int[] { 4, 6, 8, 1, 9, 3, 8, 4, 1, 4, 0, 8, 3, 7, 1, 5, 6, 3, 2, 1, 8, 4,
        // 9 }));
        // System.out.println(exercise44.squaresNeeded(4));
        // System.out.println(exercise45.josephusPermutation(new
        // ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7)),3));
        // System.out.println(Arrays.toString(exercise46.smallest(261235)));
        // System.out.println(exercise47.high("what time are we climbing up to the
        // volcano"));
        // System.out.println(exercise48.camelCase("camelCase"));
        // System.out.println(Arrays.toString(exercise49.sumParts((new int[] { 0, 1, 3,
        // 6, 10 }))));
        // System.out.println(exercise50.perimeter(BigInteger.valueOf(30)));
        // System.out.println(exercise51.nextBiggerNumber(10990));
        // System.out.println(Arrays.toString(exercise52.deleteNth(new int[] { 20, 37,
        // 20, 21 }, 1)));
        // System.out.println(exercise53.thirt(1111111111));
        // System.out.println(exercise54.pingPong("pong-ping-pong-ping-pong-bonk-foom-donk-pong-ping-pong-ping-pong-ping-pong-ping-pong-ping-poof-twat-pong-ping-pong-ping-pong-ring-pong-ping-pong-ping-pong-bong"));
        // System.out.println(exercise55.solve(10000,10));
        // System.out.println(exercise56.notPrimes(2, 222));
        // System.out.println(Arrays.toString(exercise57.findMine(
        // new int[][] { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }
        // })));
        // System.out.println(exercise58.detectBruteForce(new String[] { "5.5.5.5
        // LOGIN_FAIL user=x",
        // "5.5.5.5 LOGIN_FAIL user=x", "5.5.5.5 LOGIN_FAIL user=x", "5.5.5.5
        // LOGIN_SUCCESS user=x",
        // "5.5.5.5 LOGIN_FAIL user=x", "5.5.5.5 LOGIN_FAIL user=x", "5.5.5.5 LOGIN_FAIL
        // user=x" }));
        // System.out.println(
        // Arrays.toString(exercise59.inArray(new String[] { "arp", "live", "strong" },
        // new String[] {
        // "lively", "alive", "harp", "sharp", "armstrong" })));
        // System.out.println(Arrays.toString(exercise60.onlyOddDigPrimes(100)));
        // System.out.println(
        // Arrays.toString(exercise61
        // .snail(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
        // 14, 15, 16 } })));
        // System.out.println(exercise62.dblLinear(20));
        // System.out.println(exercise63.candles(11,3));
        // System.out.println(exercise64.search("a **& bZ"));
        // System.out.println(exercise65.adjacentElementsProduct(new int[] { -23, 4, -5,
        // 99, -27, 329, -2, 7, -921 }));
        // System.out.println(exercise66.fibonacci(1000));
        // System.out.println(exercise67.encryptThis("A wise old owl lived in an oak"));
        // System.out.println(exercise68.grabscrab("oolp", Arrays.asList("donkey",
        // "pool", "horse", "loop")));
        // System.out.println(exercise69.isValid(new char[] { 'n', 's', 'n', 's', 'n',
        // 's', 'n', 's', 'n', 's'}));
        // System.out.println(exercise70.digPow(46288, 3));
        // System.out.println(exercise71.findUniq(new double[] { 1, 1, 1, 2, 1, 1 }));
        // System.out.println(exercise72.fruit(new String[][] { new String[] { "King",
        // "Cherry", "Bar", "Jack", "Seven",
        // "Queen", "Star", "Shell", "Bell", "Wild" },
        // new String[] { "Bell", "Seven", "Jack", "Queen", "Bar",
        // "Star", "Shell", "Wild", "Cherry", "King" },
        // new String[] { "Wild", "King", "Queen", "Seven", "Star",
        // "Bar", "Shell", "Cherry", "Jack", "Bell" } },
        // new int[] { 0, 0, 1 }));
        // System.out.println(Arrays.toString(exercise73.oneTwoThree(45)));
        // System.out.println(exercise74.addCheckDigit("12388878"));
        // System.out.println(Arrays.toString(exercise75.getCard()));
        // System.out.println(exercise76.makePassword(26, true, true, true));
        // System.out.println(exercise77.minNumTaxis(new int[][] { { 1, 4 }, { 2, 9 }, { 3, 6 }, { 5, 8 } }));
        // System.out.println(exercise78.urlShortener("https://www.codewars.com/kata/5ef9ca8b76be6d001d5e1c3e"));
        System.out.println(exercise79.CalculateReward(36,27));
    }
}
