package Bit_Manipulation.Basics;

public class Check_Kth_bit {
    public String checkIthBit(int n, int k) {
        if ((n & (1 << k)) != 0) {
            return "Kth bit is 1";
        }

        return "Kth bit is 0";
    }
}
