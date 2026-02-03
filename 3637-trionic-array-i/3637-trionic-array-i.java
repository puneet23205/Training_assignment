class Solution {

    public boolean isTrionic(int[] nums) {

        int n = nums.length;

        // Minimum size check
        if (n < 4) return false;

        int i = 0;

        // 1st Part: Strictly Increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Must move at least once
        if (i == 0) return false;

        int peak1 = i;

        // 2nd Part: Strictly Decreasing
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }

        // Must move at least once
        if (i == peak1) return false;

        int valley = i;

        // 3rd Part: Strictly Increasing
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        // Must reach end
        if (i == valley) return false;

        return i == n - 1;
    }
}
