package Arrays;

public class LC1920_Build_Array_from_Permutation {
    public int[] buildArray(int[] num) {
        int n = num.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = num[num[i]];
        }

        return ans;
    }
}
