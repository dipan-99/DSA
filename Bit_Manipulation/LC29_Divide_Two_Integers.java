package Bit_Manipulation;

public class LC29_Divide_Two_Integers {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor)
            return 1;

        boolean sign = true;

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = false;
        }

        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        while (n >= d) {
            int count = 0;

            while (n >= (d << (count + 1))) {
                count++;
            }

            ans += (1L << count);
            n -= (d << count);
        }

        if (ans == (1L << 31) && sign)
            return Integer.MAX_VALUE;

        if (ans == (1L << 31) && !sign)
            return Integer.MIN_VALUE;

        if (sign)
            return (int) ans;
        else
            return (int) -ans;
    }
}
