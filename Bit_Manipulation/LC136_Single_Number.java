package Bit_Manipulation;

public class LC136_Single_Number {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int x : nums) {
            ans ^= x;
        }

        return ans;
    }
}
