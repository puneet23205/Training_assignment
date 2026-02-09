import java.util.*;

class Solution {

    public void generate(int ind, int[] nums,
                         List<Integer> ds,
                         List<List<Integer>> ans) {

        // Add current subset
        ans.add(new ArrayList<>(ds));

        // Try all possibilities from current index
        for (int i = ind; i < nums.length; i++) {

            // Pick
            if(i != ind && nums[i]== nums[i-1]) continue;
            ds.add(nums[i]);

            // Recurse
            generate(i + 1, nums, ds, ans);

            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        generate(0, nums, new ArrayList<>(), ans);

        return ans;
    }
}
