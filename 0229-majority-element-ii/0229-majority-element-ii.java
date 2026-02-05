class Solution {
    public List<Integer> majorityElement(int[] nums) {

          List<Integer> ans= new ArrayList<>();

   int element1 =0,counter1=0;
   int element2 =0,counter2=0;
   int n=nums.length;
     
     for( int i=0;i<n;i++){

        if( counter1==0 && nums[i]!=element2){
            counter1=1; element1=nums[i];
        }

        else if( counter2==0 && nums[i]!=element1){
            counter2=1; element2=nums[i];
        }

        else if(nums[i]==element1) counter1++;
        else  if(nums[i]==element2) counter2++;

        else {
            counter1--;
            counter2--;
        }

     }
     counter1=0;
     counter2=0;

     for(int x:nums){
        if(x==element1)counter1++;
        else if(x==element2)counter2++;
     }

     if(counter1>n/3){
        ans.add(element1);
     }
     if(counter2>n/3){
        ans.add(element2);
     }
      return ans;
    }
   
}