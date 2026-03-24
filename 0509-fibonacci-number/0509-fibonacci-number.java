class Solution {
    public int fib(int n) {
         
        //   int [] dp= new int[n+1];
        //   for(int i=0;i<=n;i++) {
        //     dp[i]=-1;
        //   } 
        //   if(n<=1) return n;
        //   dp[0]=0;
        //   dp[1]=1;
        
        // for(int i=2;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }

        // return dp[n];

        if(n<=1) return n;
         int prev2=0;
         int prev=1;

         int curr=-1;
         for(int i=2;i<= n;i++){
            curr=prev2+prev;
            prev2=prev;
            prev=curr;
         }

         return prev;
    }
}