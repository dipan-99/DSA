package Bit_Manipulation.Basics;

public class XOR_in_given_range {
    public int findRangeXOR(int l, int r) {
        return xor(l - 1) ^ xor(r);
    }

    public static int xor(int x) {
        if (x % 4 == 1)
            return 1;
        else if (x % 4 == 2)
            return x + 1;
        else if (x % 4 == 3)
            return 0;
        else
            return x;
    }
}
