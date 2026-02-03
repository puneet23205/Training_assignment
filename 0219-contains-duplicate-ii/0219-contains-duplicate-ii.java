import java.util.*;

class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // If already in window → duplicate within k
            if (set.contains(nums[i])) {
                return true;
            }

            // Add current element
            set.add(nums[i]);

            // Remove element which is too far
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}
