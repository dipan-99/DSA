package Binary_Search;

public class LC1482_Minimum_Number_of_Days_to_Make_m_Bouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;

        int l = minElem(bloomDay);
        int r = maxElem(bloomDay);
        int ans = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (possible(bloomDay, mid, m, k) == true) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public static boolean possible(int[] arr, int day, int m, int k) {
        int count = 0;
        int B = 0;

        for (int x : arr) {
            if (x <= day) {
                count++;

                if (count == k) {
                    B++;
                    count = 0;

                    if (B == m) {
                        return true;
                    }
                }
            } else {
                count = 0;
            }
        }

        return false;
    }

    public static int maxElem(int[] A) {
        int max = A[0];

        for (int x : A) {
            max = Math.max(max, x);
        }

        return max;
    }

    public static int minElem(int[] A) {
        int min = A[0];

        for (int x : A) {
            min = Math.min(min, x);
        }

        return min;
    }
}
