package Arrays.Basics;

import java.util.Scanner;

public class Second_Largest_in_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int largest;
        int secondLargest;

        if (arr[0] > arr[1]) {
            largest = arr[0];
            secondLargest = arr[1];
        } else {
            largest = arr[1];
            secondLargest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {

                secondLargest = arr[i];

            }

        }

        System.out.println(secondLargest);

        sc.close();
    }
}
