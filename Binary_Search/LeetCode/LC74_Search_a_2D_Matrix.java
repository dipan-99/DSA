package Binary_Search.LeetCode;

public class LC74_Search_a_2D_Matrix {

    // Best Solution --- TC = O(log(m * n)), SC = O(1)
    public boolean searchMatrixSOL1(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0;
        int r = m * n - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return false;
    }

    // Better Solution --- TC = O(m + log(n)), SC = O(1)
    public boolean searchMatrixSOL2(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (matrix[i][0] < target && target <= matrix[i][n - 1]) {
                return bs(matrix[i], target);
            }
        }

        return false;
    }

    public boolean bs(int[] arr, int k) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == k) {
                return true;
            } else if (arr[m] < k) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return false;
    }
}
