class Solution {
    public int majorityElement(int[] nums) {
        
        int n= nums.length;
        int count=0;

      int majelement=0;
      for(int i=0;i<n;i++){

       if(count==0){
            majelement=nums[i];
        }

            if(nums[i]==majelement) {
                count++;
            }
            else count--;
        
      }
      return majelement;
    }
}