import java.util.*;

class Solution {

    private void findCombinations(int ind, int[] arr, int target,
                                  List<List<Integer>> ans,
                                  List<Integer> ds) {

        // Base Case
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // Loop through candidates
        for (int i = ind; i < arr.length; i++) {

            // Skip duplicates
            if (i > ind && arr[i] == arr[i - 1])
                continue;

            // If element is greater than target, stop
            if (arr[i] > target)
                break;

            // Pick element
            ds.add(arr[i]);

            // Recursive call
            findCombinations(i + 1, arr, target - arr[i], ans, ds);

            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        // Sort to handle duplicates
        Arrays.sort(candidates);

        // Call helper
        findCombinations(0, candidates, target, ans, new ArrayList<>());

        return ans;
    }
}
