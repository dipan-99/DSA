package Loops.Basics;

import java.util.Scanner;

public class Print_n_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = 1;

        while (num1 >= num2) {
            System.out.println(num2);
            num2++;
        }

        sc.close();
    }
}
