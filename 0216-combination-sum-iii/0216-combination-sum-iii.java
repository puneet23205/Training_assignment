import java.util.*;

class Solution {

    public void backtrack(int start, int k, int target,
                          List<Integer> ds,
                          List<List<Integer>> ans) {

        // Valid combination
        if (ds.size() == k && target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Pruning
        if (ds.size() > k || target < 0)
            return;

        // Try numbers from start to 9
        for (int i = start; i <= 9; i++) {

            // Pick
            ds.add(i);

            // Recurse
            backtrack(i + 1, k, target - i, ds, ans);

            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(1, k, n, new ArrayList<>(), ans);

        return ans;
    }
}
