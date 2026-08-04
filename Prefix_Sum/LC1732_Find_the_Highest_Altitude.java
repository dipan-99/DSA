package Prefix_Sum;

public class LC1732_Find_the_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int current = 0;
        int maxAltitude = 0;

        for (int g : gain) {
            current += g;
            maxAltitude = Math.max(maxAltitude, current);
        }

        return maxAltitude;
    }
}
