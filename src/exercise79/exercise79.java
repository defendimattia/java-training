package exercise79;

public class exercise79 {

    public static String CalculateReward(int currentPoint, int numberOfJewelry) {

        int freeItem = 0;
        int payItem = 0;

        for (int i = 0; i < numberOfJewelry; i++) {
            if (currentPoint >= 5) {
                currentPoint -= 5;
                freeItem++;
            } else {
                currentPoint++;
                payItem++;
            }
        }
        return String.format("Point Left: %d. Free Item: %d. Pay Item: %d", currentPoint, freeItem, payItem);
    }
}
