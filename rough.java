import java.util.*;

public class rough {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }

    public static boolean isPrime(int n) {

        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            return true;
        } else {
            return false;
        }
    }
}
