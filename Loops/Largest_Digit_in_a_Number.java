package Loops;

import java.util.Scanner;

public class Largest_Digit_in_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int great = 0;

        while (num1 > 0) {
            int dig = num1 % 10;
            if (dig > great) {
                great = dig;
            }
            num1 = num1 / 10;
        }

        System.out.println(great);

        sc.close();
    }
}
