package Bit_Manipulation;

public class LC268_Missing_Number {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int totalSum = (n * (n + 1)) >> 1;

        for (int num : nums) {
            sum += num;
        }

        return totalSum - sum;
    }

}