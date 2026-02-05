import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        List<List<Integer>> res = new ArrayList<>();

        // Step 1: Sort
        Arrays.sort(nums);

        // Step 2: Fix first element
        for(int i = 0; i < n-2; i++){

            // Skip duplicate i
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i + 1;
            int right = n - 1;

            // Step 3: Two pointers
            while(left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){

                    // Add triplet
                    res.add(Arrays.asList(
                        nums[i], nums[left], nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate left
                    while(left < right && nums[left] == nums[left-1])
                        left++;

                    // Skip duplicate right
                    while(left < right && nums[right] == nums[right+1])
                        right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }

        return res;
    }
}
