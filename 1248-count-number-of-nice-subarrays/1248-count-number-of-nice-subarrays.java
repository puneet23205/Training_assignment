class Solution {

    public int numberOfSubarrays(int[] nums, int k) {

        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {

        if (k < 0) return 0;

        int left = 0;
        int sum = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            // Convert odd -> 1, even -> 0
            if (nums[right] % 2 == 1)
                sum += 1;

            while (sum > k) {

                if (nums[left] % 2 == 1)
                    sum -= 1;

                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
}
