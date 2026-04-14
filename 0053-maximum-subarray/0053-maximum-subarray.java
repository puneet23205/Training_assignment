class Solution {
    public int maxSubArray(int[] nums) {

        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int x : nums){
            currsum +=x;

            maxsum = Math.max(currsum,maxsum);

          currsum= (currsum<0)?0:currsum;
        }

        return maxsum;

    }
}
