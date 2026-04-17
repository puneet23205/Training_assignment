class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int step=0,i=start;step<nums.length;step++,i=(i+1)%n){
          if(nums[i]==target){
            int dist=Math.abs(i-start);
            min=Math.min(dist,min);
          }
        }
        return min;
    }
}