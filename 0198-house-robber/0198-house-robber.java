class Solution {
 public int rob(int[] nums) {
     
     int n = nums.length;

     int [] dp = new int[n];
     Arrays.fill(dp,-1);

     return findmaxmoney(n-1,nums,dp);
  } 

  private static int findmaxmoney(int n,int [] nums,int dp[]){
     
     if(n<0) return 0;
     if( n == 0) return nums[n];

     if(dp[n] != -1) return dp[n];
     
     
     int pick = nums[n] + findmaxmoney( n-2, nums,dp);

     int notpick = findmaxmoney( n-1,nums,dp);

     dp[n] = Math.max(pick,notpick);

     return dp[n];
   }
}