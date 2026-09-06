package Hashing;

import java.util.HashMap;

public class LC242_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        if (map1.equals(map2)) {
            return true;
        }

        return false;
    }
}
