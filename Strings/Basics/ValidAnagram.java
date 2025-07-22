package Strings.Basics;

import java.util.Map;
import java.util.HashMap;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean ans = isAnagram(s, t);
        System.out.println("The Ansswer is: " +ans);
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        int len = s.length();

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < len; i++) {
            char ch = t.charAt(i); 
            if (!mp.containsKey(ch)) {
                return false;
            }
            int count = mp.get(ch) - 1;
            if (count == 0) {
                mp.remove(ch);
            } else {
                mp.put(ch, count);
            }
        }

        return mp.isEmpty();
    }
}