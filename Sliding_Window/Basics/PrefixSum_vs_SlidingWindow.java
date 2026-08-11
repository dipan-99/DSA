package Sliding_Window.Basics;

import java.util.*;
public class PrefixSum_vs_SlidingWindow {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 3;

        // Output
        System.out.println("Prefix Sum sums");
        prefixSum(arr, k);

        System.out.println();

        System.out.println("Slinding Window sums");
        slidingWindow(arr, k);

        sc.close();
    }

    public static void prefixSum(int[] arr, int k) {
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i <= n - k; i++) {
            int left = i;
            int right = i + k - 1;
            int sum;

            if (left == 0) {
                sum = prefix[right];
            } else {
                sum = prefix[right] - prefix[left - 1];
            }

            System.out.print(sum + " ");
        }
    }

    public static void slidingWindow(int[] arr, int k) {
        int n = arr.length;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        System.out.print(windowSum + " ");

        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];

            System.out.print(windowSum + " ");
        }

        System.out.println();
    }
}
