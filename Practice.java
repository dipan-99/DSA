import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefix =new  int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int l = sc.nextInt();
        int r = sc.nextInt();

        int ans = PrefixSum(prefix, l, r);

        System.out.println(ans);

        sc.close();
    }

    public static int PrefixSum(int[] arr, int l, int r) {
        if (l == 0) {
            return arr[r];
        }

        return arr[r] - arr[l - 1];
    }
}