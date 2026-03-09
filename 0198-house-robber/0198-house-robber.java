class Solution {
 public int rob(int[] nums) {
    int n = nums.length;
    
    // Our final "Memory List"
    int[] dp = new int[n];
    
    // Base Case: The very first house
    dp[0] = nums[0];

    for(int i = 1; i < n; i++) {
        // Choice 1: Skip this house, take whatever we had at the previous house
        int notPick = dp[i - 1];
        
        // Choice 2: Pick this house + loot from 2 houses ago
        int pick = nums[i];
        if(i > 1) {
            pick += dp[i - 2];
        }
        
        // Store the winner in our table
        dp[i] = Math.max(pick, notPick);
    }
    
    // The last spot in the table is our ultimate answer
    return dp[n - 1];
}
}