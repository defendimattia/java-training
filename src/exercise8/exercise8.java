package exercise8;

public class exercise8 {

    public static String makeReadable(int seconds) {

        int mins = 0;
        int hours = 0;

        while (seconds >= 60) {
            seconds -= 60;
            mins += 1;
        }

        while (mins >= 60) {
            mins -= 60;
            hours += 1;
        }

        return String.format("%02d", hours) + ":" + String.format("%02d", mins) + ":" + String.format("%02d",
                seconds);
    }
}
