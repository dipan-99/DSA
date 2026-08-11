package Sliding_Window.Basics;

import java.util.*;

public class Sliding_window {
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
        System.out.println("Slinding Window sums");
        slidingWindow(arr, k);

        sc.close();
    }

    public static void slidingWindow(int[] arr, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // First Window
        System.out.print(windowSum + " ");

        // Remaining Window
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];

            System.out.print(windowSum + " ");
        }

        System.out.println();
    }
}
/*
 * Sample Input
 *
 * 6
 * 1 7 3 6 5 6
 *
 * Output
 *
 * 11 16 14 17
 */