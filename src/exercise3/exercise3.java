package exercise3;


public class exercise3 {
    
    public static String[] solution(String s) {

        if (s.length() == 0) {

            return new String[0];
        }

        String[] result = s.split("(?<=\\G..)");

        if (result[result.length - 1 ].length() == 1) {
            result[result.length - 1 ] += "_";
        }
        
        return result;
    }
}
