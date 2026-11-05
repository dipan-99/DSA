package Math.LeetCode;

public class LC171_Excel_Sheet_Column_Number {
    public int titleToNumber(String columnTitle) {
        int ans = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            int value = columnTitle.charAt(i) - 'A' + 1;

            ans = ans * 26 + value;
        }

        return ans;
    }
}
