package Hashing.Basics;

import java.util.HashMap;
import java.util.Map;

public class Accessing_key_and_value {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        //Only Key
        for (int key : map.keySet()) {
            System.out.println(key);
        }

        //Only Value
        for (int key : map.keySet()) {
            System.out.println(map.get(key));
        }

        //Key-Value Pair
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
