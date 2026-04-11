import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>());
            List<Integer> list = map.get(nums[i]);

            list.add(i);

            if (list.size() >= 3) {
                int k = list.size();
                int i1 = list.get(k - 3);
                int i3 = list.get(k - 1);

                int dist = 2 * (i3 - i1);
                min = Math.min(min, dist);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}