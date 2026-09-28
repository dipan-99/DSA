package Bit_Manipulation.LeetCode;

public class LC136_Single_Number {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int x : nums) {
            ans ^= x;
        }

        return ans;
    }
}
