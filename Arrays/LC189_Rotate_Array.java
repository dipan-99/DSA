package Arrays;

public class LC189_Rotate_Array {
    public void rotate(int[] nums, int k) {
        int k1 = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k1 - 1);
        reverse(nums, k1, nums.length - 1);
    }

    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
