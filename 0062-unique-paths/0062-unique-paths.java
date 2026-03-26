class Solution {
    public int uniquePaths(int m, int n) {
         
    //      int [][] dp = new int[m][n];

    //      for(int[] row:dp){
    //         Arrays.fill(row,-1);
    //      }
    //        return  findnumofuniquepath( m-1, n-1,dp);
    // }

    // public static int findnumofuniquepath(int m,int n,int [][] dp){
    //           if( m==0 && n==0) return 1;

    //           if(m <0 || n<0) return 0;
              
    //           if(dp[m][n] != -1) return dp[m][n];

    //           int up= findnumofuniquepath(m-1,n,dp);
    //           int left = findnumofuniquepath(m,n-1,dp);

    //          return  dp[m][n]= up+left;
      

     int[][] dp = new int[m][n];

        // base cases
        for(int i = 0; i < m; i++) dp[i][0] = 1;
        for(int j = 0; j < n; j++) dp[0][j] = 1;

        // fill rest
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];

   }
}