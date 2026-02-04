class Solution {
    public void sortColors(int[] nums) {
        
        int n= nums.length;
        int low=0;
        int mid=0;
        int high=n-1;


        
        while(mid<=high){

//swap low and mid if first index od unsorted array is 0

        if(nums[mid]==0){
            int temp=nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;

            low++;
            mid++;
        }
         //swap low and mid if first index od unsorted array is 1

         else if(nums[mid]==1) mid++;

         else {
            int temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;

            high--;
         }
    }
  }
}