package Arrays.Basics_1D;

import java.util.Scanner;

public class Zeros_at_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)  {
                arr[index] = arr[i];
                index++;
            }
        }

        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        sc.close();
    }
}
