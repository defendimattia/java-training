package exercise40;

import java.util.ArrayList;
import java.util.List;

public class exercise40 {

    public static List<String> draw(List<String> deck) {
        List<String> copyDeck = new ArrayList<>(deck);
        return execution(copyDeck, new ArrayList<>() {
        });
    }

    private static List<String> execution(List<String> deck, List<String> result) {
        if (deck.isEmpty()) {
            return result;
        }

        result.add(deck.get(0));
        deck.remove(0);

        if (!deck.isEmpty()) {
            deck.add(deck.get(0));
            deck.remove(0);
        }
        return execution(deck, result);
    }
}
