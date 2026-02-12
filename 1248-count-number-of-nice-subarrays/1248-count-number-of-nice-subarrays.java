class Solution {

    public int numberOfSubarrays(int[] nums, int k) {
     
     return atmost(nums,k)- atmost(nums,k-1);
    }

    private int atmost(int [] nums,int k){

         int left=0;
         int n= nums.length;
         int count=0;
         int num=0;
         if(k<0) return 0;

         for(int right=0;right<n ;right++){
          
          if(nums[right]%2 ==1){
            count++;
          }
          while(count>k){
            if(nums[left]%2 == 1){
                count--;
            }
            left++;
          }
          num+=(right-left+1);
        
         }
        return num;
    }
    
}
