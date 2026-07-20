package Arrays.Basics_1D;

import java.util.Scanner;

public class Prefix_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        System.out.print("Enter the left index: ");
        int L = sc.nextInt();
        System.out.print("Enter the right index: ");
        int R = sc.nextInt();

        System.out.print("Range sum: ");
        System.out.println(rangeSum(prefix, L, R));

        sc.close();
    }

    public static int rangeSum(int[] arr, int l, int r) {
        if (l == 0) {
            return arr[r];
        }
        return arr[r] - arr[l - 1];
    }
}
