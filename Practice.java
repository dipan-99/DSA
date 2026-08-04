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

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int rightSum = sum - leftSum - arr[i];

            leftSum += arr[i];

            if (leftSum == rightSum) {
                System.out.println(1);
                break;
            }

            System.out.println(-1);
        }

        // Output



        sc.close();
    }

    public int pivotIndex(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];

            leftSum += nums[i];

            if (leftSum == rightSum) {
                return i;
            }

        }

        return -1;
    }
}