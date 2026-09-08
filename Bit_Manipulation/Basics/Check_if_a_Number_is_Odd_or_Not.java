package Bit_Manipulation.Basics;

public class Check_if_a_Number_is_Odd_or_Not {
    public boolean isOdd(int n) {
        if ((n & 1) == 0) {
            return false;
        }

        return true;
    }
}
