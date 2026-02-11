class Solution {
    public int maxScore(int[] cardPoints, int k) {

      int n = cardPoints.length;
      int [] nums= cardPoints;
      int window= n-k;
      int total=0;
      int minwindowsum=0;
      int minsum=Integer.MAX_VALUE;
      //The idea is to find the window with minimum suma and subtract from total

      for(int i=0;i<n;i++){
    total=total+nums[i];
      }
      if (k==n) return total;
      int left=0;

      for(int right=0;right<n;right++){
        minwindowsum += nums[right];
        
        if (right-left+1>n-k){
            minwindowsum = minwindowsum-nums[left];
            left++;
        
        }
        if(right-left+1==window){
    
            minsum=Math.min(minsum,minwindowsum);
        }
      }
     return total-minsum;
    }
}
