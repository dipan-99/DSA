package Bit_Manipulation;

public class LC2220_Minimum_Bit_Flips_to_Convert_Number {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;

        int count = 0;

        while (xor > 0) {
            xor &= (xor - 1);
            count++;
        }

        return count;
    }
}
