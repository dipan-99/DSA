package Bit_Manipulation.Basics;

public class Swap_Two_Numbers {
    public int[] swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return new int[] {a, b};
    }
}
