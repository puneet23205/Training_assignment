class Solution {
    public int majorityElement(int[] nums) {
        
       int candidate =0;
       int counter =0;
       int n=nums.length;

        for(int i=0; i<nums.length;i++){

            if(counter == 0){
                candidate= nums[i];
                counter++;
            }
            else if (nums[i]== candidate) {
                counter ++;
            }
            else 
               counter--;
        }

         counter =0;
        for(int x :nums){
            if(x== candidate)  counter++;
        }

        if(counter >n/2){
            return candidate;
        }

        else 
        return -1;
    }
}