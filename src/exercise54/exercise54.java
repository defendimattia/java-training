package exercise54;

public class exercise54 {

    public static String pingPong(String sounds) {

        String[] array = sounds.split("-");
        String serving = "";
        String lastHitWin = "";
        int ping = 0, pong = 0;
        int set = 0;

        for (String string : array) {
            if (string.equals("ping")) {
                serving = serving.equals("") ? string : serving;
                set++;
                lastHitWin = "pong";
            } else if (string.equals("pong")) {
                serving = serving.equals("") ? string : serving;
                set--;
                lastHitWin = "ping";
            } else {
                if (set == 0) {
                    if (serving.equals("ping"))
                        ping++;
                    if (serving.equals("pong"))
                        pong++;
                } else {
                    set = 0;
                }
                serving = "";
            }
        }
        return ping == pong ? lastHitWin : (ping > pong ? "ping" : "pong");
    }

}
