package Recursion.Basics;

public class Check_Palindrome_using_Recursion {
    public int solve(String A) {
        int l = 0, r = A.length() - 1;

        return check(A, l, r) ? 1 : 0;
    }

    boolean check(String s, int l, int r) {
        if (l >= r)
            return true;

        if (s.charAt(l) != s.charAt(r))
            return false;

        return check(s, l + 1, r - 1);
    }
}
