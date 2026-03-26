class Solution {
    public int uniquePathsWithObstacles(int[] [] grid) {
        
        int m= grid.length;
        int n=grid[0].length;
        int [][] dp = new int [m][n];

        for(int [] row :dp){
            Arrays.fill(row,-1);
        }

        return findpath(grid,m-1,n-1,dp);
    }

    private static int findpath(int [][] grid,int m, int n, int dp [][]){

        if(m>=0 && n>=0  && grid[m][n] == 1) return 0;
        if(m==0 && n==0) return 1;
        if( m<0 || n<0) return 0;

        if(dp[m][n] != -1) return dp[m][n];

        int up=findpath(grid,m-1,n,dp);
        int left=findpath(grid,m,n-1,dp);

        return dp[m][n]=up+left;
    }
}