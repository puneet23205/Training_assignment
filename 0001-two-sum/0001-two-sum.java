class Solution {
    public int[] twoSum(int[] nums, int target) {
            // hash Map to store number -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // Check if complement exists
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number
            map.put(nums[i], i);
        }

        // No solution (won't happen as per problem)
        return new int[] {};
    }
}