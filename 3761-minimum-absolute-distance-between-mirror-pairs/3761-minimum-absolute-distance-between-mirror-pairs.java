class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            
            int num=nums[i];

            if(map.containsKey(num)){
                int dist=Math.abs(i-map.get(num));
                min=Math.min(min,dist);
            }
            int rev=reverse(num);
            map.put(rev,i);
        }

        if(min==Integer.MAX_VALUE) return -1;
        else return min;
    }

    private static int reverse (int n){
        int rev=0;
        while(n>0){
            int r=n%10;
            rev=rev*10+r; 
            n=n/10;     
        }
        return rev;
    }

}