class Solution {
    public int maxScore(int[] cardPoints, int k) {

        // int n = cardPoints.length;

        // // Sum of all cards
        // int total = 0;
        // for (int x : cardPoints) {
        //     total += x;
        // }

        // // If we take all cards
        // if (k == n) return total;

        // int window = n - k;

        // // Initial window sum
        // int curr = 0;
        // for (int i = 0; i < window; i++) {
        //     curr += cardPoints[i];
        // }

        // int minSum = curr;

        // // Sliding window
        // for (int i = window; i < n; i++) {

        //     curr += cardPoints[i];
        //     curr -= cardPoints[i - window];

        //     minSum = Math.min(minSum, curr);
        // }

        // return total - minSum;


        //another method can be just by using variables 

        int left=0,right=cardPoints.length-1;
        int lsum=0,maxsum=0,rsum=0;

        for( int i=0;i<k;i++){
            lsum+=cardPoints[i];
            maxsum=lsum;
        }
        for(int j=k-1;j>=0;j--){
            lsum=lsum-cardPoints[j];
            rsum=rsum+cardPoints[right];
            right--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}
