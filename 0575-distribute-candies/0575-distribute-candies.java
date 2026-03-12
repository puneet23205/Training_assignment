class Solution {
    public int distributeCandies(int[] nums) {
        
        int candies =1;
        int n= nums.length;
        Arrays.sort(nums);
         for(int i=1;i<n;i++){
              if(nums[i] != nums[i-1]){
                if(candies<n/2){
                candies++;
                }
              }
         }
         return candies;
    }
}