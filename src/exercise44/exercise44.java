package exercise44;

public class exercise44 {

    public static int squaresNeeded(long grains) {

        return findSquare(grains,0);
    }

    private static int findSquare (long grains, int cell) {

        if (grains == 0) {
            return cell;
        }

        return findSquare(grains / 2, cell + 1);
    }
    
}
