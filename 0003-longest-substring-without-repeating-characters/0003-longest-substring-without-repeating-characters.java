import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char c = s.charAt(right);

            // If character already exists in window
            if (map.containsKey(c)) {

                // Move left pointer safely
                left = Math.max(left, map.get(c) + 1);
            }

            // Update latest index
            map.put(c, right);

            // Update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
