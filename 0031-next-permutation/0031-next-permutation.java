class Solution {

    public void nextPermutation(int[] nums) {
     
     int n= nums.length;



     int i= n-2;

     while(i>=0 && nums[i]>=nums[i+1]){
        i--;
       
     }

     if( i>=0){

        for(int j =n-1;j>i;j--){
            if(nums[j]>nums[i]){
                        int temp=nums[i];
                         nums[i]=nums[j];
                         nums[j]=temp;
                         break;
            }
        }
     }

    reverse(nums,i+1,n-1);
    }

     private void reverse(int [] nums,int left,int right){
        while(left<right){
            int temp=nums[left];
            nums[left]= nums[right];
            nums[right]=temp;

            left++;
            right--;
        }
     }
        
}
