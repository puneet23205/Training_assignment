class Solution {
    public int minimumDistance(int[] nums) {
        
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
    
            int left=i+1;
            int right=n-1;
  

            while(left<right){ 
                if(nums[i] == nums[left] && nums[left]==nums[right] && nums[i]==nums[right]){
                int distnace=Math.abs(i-left)+Math.abs(i-right)+Math.abs(left-right);
                
                min=Math.min(min,distnace);
                }
              if(nums[i]==nums[right] && nums[left] != nums[i]) left++;
              else if(nums[i] == nums[left] && nums[left]== nums[right]) right--;
              else if(nums[i] == nums[left])right--;
              else {
                left++;
                right--;
              }
            }
        }
        if(min == Integer.MAX_VALUE) return -1;
        else return min;
    }
}