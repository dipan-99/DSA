package Math.LeetCode;

public class LC829_Consecutive_Numbers_Sum {
    public int consecutiveNumbersSum(int n) {
        int count = 0;

        for (int k = 1; k * (k - 1) / 2 < n; k++) {
            int remaining = n - k * (k - 1) / 2;

            if (remaining % k == 0) {
                count++;
            }
        }

        return count;
    }
}
