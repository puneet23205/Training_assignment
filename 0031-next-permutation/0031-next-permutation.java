class Solution {

    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n - 2;

        // Step 1: Find break point
        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        // Step 2: If break exists
        if(i >= 0){

            int j = n - 1;

            while(nums[j] <= nums[i]){
                j--;
            }

            // swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 3: Reverse remaining part
        reverse(nums, i+1, n-1);
    }

    private void reverse(int[] nums, int l, int r){

        while(l < r){

            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            l++;
            r--;
        }
    }
}
