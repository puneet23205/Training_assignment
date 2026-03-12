class Solution {
    public int distributeCandies(int[] nums) {
        
       
        HashSet<Integer> set = new HashSet<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(set.size() < n/2){
                set.add(nums[i]);
            }
        }
        int candies = set.size();
        return candies;
    }
}