import java.util.*;

public class rough {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}