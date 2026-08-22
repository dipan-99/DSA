package Sliding_Window.Basics;

import java.util.*;

public class Subarray_with_MinSum {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        // Answer
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int minSum = sum;

        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            minSum = Math.min(minSum, sum);
        }

        System.out.println(minSum);

        sc.close();
    }


}