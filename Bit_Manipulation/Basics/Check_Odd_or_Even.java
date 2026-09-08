package Bit_Manipulation.Basics;

public class Check_Odd_or_Even {
    public boolean isOdd(int n) {
        if ((n & 1) == 0) {
            return false;
        }

        return true;
    }
}
