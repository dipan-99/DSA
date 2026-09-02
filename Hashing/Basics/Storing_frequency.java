package Hashing.Basics;
import java.util.HashMap;

public class Storing_frequency {
    public static void main(String[] args) {

        // Number Frequency
        int[] arr = {};
        HashMap<Integer, Integer> freqNum = new HashMap<>();

        for (int num : arr) {

            if (freqNum.containsKey(num)) {
                freqNum.put(num, freqNum.get(num) + 1);
            } else {
                freqNum.put(num, 1);
            }
        }

        //OR

        for (int num : arr) {
            freqNum.put(num, freqNum.getOrDefault(num, 0) + 1);
        }

        // String Frequency
        String str = "";
        HashMap<Character, Integer> freqStr = new HashMap<>();

        for (char ch : str.toCharArray()) {
            freqStr.put(ch, freqStr.getOrDefault(ch, 0) + 1);
        }
    }
}
