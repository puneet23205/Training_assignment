class Solution {
    public int minAbsoluteDifference(int[] nums) {
         int n= nums.length;
         int last1=-1;
          int last2=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){

            if( nums[i] ==1){
                 last1=i;
                if(last2 !=-1 ){
                    min= Math.min(min,Math.abs(last1-last2));
                }
            }

            if(nums[i] == 2){
                last2=i;
                if(last1 != -1){
                    min=Math.min(min,Math.abs(last1-last2));
                }
            }
        }
        if(min != Integer.MAX_VALUE) {
            return min;
        }

        else return -1;
    }
}