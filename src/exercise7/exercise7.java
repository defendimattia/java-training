package exercise7;

import java.util.LinkedHashMap;
import java.util.Map;

public class exercise7 {

    public static String formatDuration(int seconds) {

        if (seconds == 0) {
            return "now";
        }

        int mins = 0;
        int hours = 0;
        int days = 0;
        int years = 0;

        while (seconds >= 60) {
            seconds -= 60;
            mins += 1;
        }

        while (mins >= 60) {
            mins -= 60;
            hours += 1;
        }

        while (hours >= 24) {
            hours -= 24;
            days += 1;
        }

        while (days >= 365) {
            days -= 365;
            years += 1;
        }

        Map<String, String> map = new LinkedHashMap<>();
        map.put("seconds", String.valueOf(seconds));
        map.put("minutes", String.valueOf(mins));
        map.put("hours", String.valueOf(hours));
        map.put("days", String.valueOf(days));
        map.put("years", String.valueOf(years));

        String result = "";

        for (Map.Entry<String, String> entry : map.entrySet()) {

            if (entry.getValue().equals("0")) {
                continue;
            }

            if (entry.getValue().equals("1") && result.equals("")) {
                result = "1 " + entry.getKey().substring(0, entry.getKey().length() - 1);
            } else if (entry.getValue().equals("1") && !result.contains("and")) {
                result = "1 " + entry.getKey().substring(0, entry.getKey().length() - 1) + " and " + result;
            } else if (entry.getValue().equals("1") && result.contains("and")) {
                result = "1 " + entry.getKey().substring(0, entry.getKey().length() - 1) + ", " + result;
            }

            if (!entry.getValue().equals("1") && result.equals("")) {
                result = entry.getValue() + " " + entry.getKey();
            } else if (!entry.getValue().equals("1") && !result.contains("and")) {
                result = entry.getValue() + " " + entry.getKey() + " and " + result;
            } else if (!entry.getValue().equals("1") && result.contains("and")) {
                result = entry.getValue() + " " + entry.getKey() + ", " + result;
            }

        }

        return result;
    }
}
