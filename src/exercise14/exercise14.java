package exercise14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class exercise14 {

    public static List<String> top3(String s) {

        String cleanString = s
                .replaceAll("[^a-zA-Z']", " ")
                .toLowerCase();

        String[] array = cleanString.split("\\s+");

        Map<String, Long> counts = Arrays.stream(array)
                .filter(w -> w.matches(".*[a-zA-Z].*"))
                .collect(Collectors.groupingBy(
                        e -> e,
                        Collectors.counting()));

        return counts.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .map(Map.Entry::getKey)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
