class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int[] res = new int[n];

        int pos = 0;
        int neg = 1;

        for(int x : nums){

            if(x > 0){
                res[pos] = x;
                pos += 2;
            }
            else{
                res[neg] = x;
                neg += 2;
            }
        }

        return res;
    }
}
