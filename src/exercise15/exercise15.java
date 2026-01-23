package exercise15;

public class exercise15 {

    public static int countBits(int n) {

        String binary = Integer.toBinaryString(n);

        return (int) binary.chars()
                .filter(c -> c == '1')
                .count();

    }

}
