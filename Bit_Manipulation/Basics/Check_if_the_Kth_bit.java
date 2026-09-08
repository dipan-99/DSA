package Bit_Manipulation.Basics;

public class Check_if_the_Kth_bit {
    public boolean checkIthBit(int n, int k) {
        if ((n & (1 << k)) != 0) {
            return true;
        }

        return false;
    }
}
