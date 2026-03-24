class Solution {
    public int climbStairs(int n) {
        
         
   // Memoization method
       
    //    int [] dp = new int[n+1];
    //    Arrays.fill(dp,-1);

    //    if(n<=1) return 1;

    //    if(dp[n] != -1) return dp[n];

    //    return climbStairs(n-1,dp) + climbStairs(n-2,dp);

    // Tabulation method 
        // int[] dp = new int[n + 1];

        // dp[0] = 1;
        // dp[1] = 1;

        // for (int i = 2; i <= n; i++) {
        //     dp[i] = dp[i - 1] + dp[i - 2];
        // }
        // return dp[n];



        // Tabulation + space optimization
         
        if(n<= 1) return n;

        int prev2=1;
        int prev1=1;
        int curr=-1;

        for(int i=2;i<=n;i++){
            curr =prev2+ prev1;
            prev2=prev1;
            prev1=curr;
        }

        return prev1;

    }
}