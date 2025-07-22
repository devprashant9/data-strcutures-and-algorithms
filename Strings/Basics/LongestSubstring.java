package Strings.Basics;

import java.util.Set;
import java.util.HashSet;

public class LongestSubstring {

    public static void main(String[] args) {
        String str = "abcabcbb";
        int ans = lengthOfLongestSubstring(str);
        System.out.println("The Answer is: " +ans);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int len = s.length();
        int left = 0;
        int ans = 0;

        for(int right = 0; right < len; right++) {
            char ch = s.charAt(right);

            while(set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}