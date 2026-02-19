import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        if (n == 0) return 0;

        int longest = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums) {
            set.add(x);
        }

        // Iterate over set (NOT nums)
        for (int y : set) {

            if (!set.contains(y - 1)) {
                int curr = y;
                int count = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}



