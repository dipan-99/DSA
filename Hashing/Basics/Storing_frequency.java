package Hashing.Basics;
import java.util.HashMap;

public class Storing_frequency {
    public static void main(String[] args) {
        int[] arr = {};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {

            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
    }
}
