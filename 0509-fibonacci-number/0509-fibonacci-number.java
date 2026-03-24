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

   // Tabulation but space optimized

        // if(n<=1) return n;
        //  int prev2=0;
        //  int prev=1;

        //  int curr=-1;
        //  for(int i=2;i<= n;i++){
        //     curr=prev2+prev;
        //     prev2=prev;
        //     prev=curr;
        //  }

        //  return prev;

        int [] dp = new int [n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
         
         return fibbo(n,dp);
    }

    private static int fibbo(int n,int [] dp){
         
         if(n <= 1) return n;

         if( dp[n] != -1) return dp[n];

         dp[n]= fibbo(n-1,dp) + fibbo(n-2,dp);

         return dp[n];
    }
}