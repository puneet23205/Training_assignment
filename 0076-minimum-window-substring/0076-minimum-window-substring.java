import java.util.*;

class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Put chars of t in map
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = t.length(); // chars still needed

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // Step 2: Expand window
        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            // If char exists in map
            if (map.containsKey(c)) {

                if (map.get(c) > 0) {
                    count--; // satisfied one char
                }

                map.put(c, map.get(c) - 1);
            }

            // Step 3: Shrink when valid
            while (count == 0) {

                // Update answer
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count++; // lost required char
                    }
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            return "";

        return s.substring(start, start + minLen);
    }
}
