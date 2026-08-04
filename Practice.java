import java.util.*;

public class Practice {

    public static void main(String[] args) {

        // Input

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Answer

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int ans = Integer.MIN_VALUE;

        // Output

        // for (int i = 0; i < n; i++) {
        // System.out.print(prefix[i] + " ");
        // }

        for (int i = 0; i < n - 1; i++) {
            if (prefix[i] > prefix[i + 1]) {
                ans = prefix[i];
            }
        }

        System.out.println(ans);

        sc.close();
    }
}