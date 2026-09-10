package Binary_Search;

public class LC410_Split_Array_Largest_Sum {
    public int splitArray(int[] nums, int k) {
        int l = maxElem(nums), r = sum(nums);

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (possible(nums, k, m)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return l;
    }

    public static boolean possible(int[] A, int B, int Max) {
        int subArray = 1;
        int curr = 0;

        for (int x : A) {
            if (curr + x <= Max) {
                curr += x;
            } else {
                subArray++;
                curr = x;

                if (subArray > B) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int maxElem(int[] A) {
        int max = A[0];

        for (int x : A) {
            max = Math.max(max, x);
        }

        return max;
    }

    public static int sum(int[] A) {
        int sum = A[0];

        for (int x : A) {
            sum += x;
        }

        return sum;
    }
}
