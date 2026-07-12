package Loops.Basics;

import java.util.Scanner;

public class Reversing_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1= sc.nextInt();
        int rev = 0;

        while (num1 > 0) {
            int dig = num1 % 10;

            num1 = num1 / 10;
            rev = (rev * 10) + dig;
        }

        System.out.println(rev);

        sc.close();
    }
}
