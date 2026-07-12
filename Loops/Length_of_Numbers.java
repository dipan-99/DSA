package Loops;

import java.util.Scanner;

public class Length_of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1= sc.nextInt();
        int dig = 0;

        while (num1 > 0) {
            num1 = num1 / 10;
            dig++;
        }

        System.out.println(dig);

        sc.close();
    }
}
