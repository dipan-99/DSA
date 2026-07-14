package Arrays.Basics;

import java.util.Scanner;

public class Linear_Search_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        boolean isPresent = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                isPresent = true;
                break;
            }
        }

        if (isPresent) {
            System.out.println("Found");
        } else {
            System.out.println("Not found");
        }

        sc.close();
    }
}
