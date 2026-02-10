import java.util.*;

class Solution {

    public int longestBalanced(int[] nums) {

        int n = nums.length;
        int maxLen = 0;

        // Start index
        for (int i = 0; i < n; i++) {

            HashSet<Integer> evenSet = new HashSet<>();
            HashSet<Integer> oddSet = new HashSet<>();

            // End index
            for (int j = i; j < n; j++) {

                int val = nums[j];

                // Add to proper set
                if (val % 2 == 0) {
                    evenSet.add(val);
                } else {
                    oddSet.add(val);
                }

                // Check balance
                if (evenSet.size() == oddSet.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
}
