class Solution {
    public int robHouse(int n,int[] nums) {

        int prev1=nums[0];
        int prev2=0;
    
        for(int i=1;i<n;i++){
           int pick = nums[i] + prev2;

           int notpick=prev1;
           int curr= Math.max(pick,notpick);

           prev2=prev1;
           prev1=curr;

        }
        return prev1;
    }
    public int rob(int[] nums) {
        int n  = nums.length;
        if(n==1) return nums[0];
        int [] FirstHouse_Skip = new int[n-1];
        int [] LastHouse_Skip = new int[n-1];

        for(int i=0;i<n-1;i++){
            FirstHouse_Skip[i] = nums[i+1];
            LastHouse_Skip[i] = nums[i];
        }

        int firstLoot = robHouse(n-1,FirstHouse_Skip);

        int LastLoot = robHouse(n-1,LastHouse_Skip);

        return Math.max(firstLoot,LastLoot);

    }
}