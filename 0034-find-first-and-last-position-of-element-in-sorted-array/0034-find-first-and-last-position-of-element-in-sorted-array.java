class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(nums[i]== target){
                list.add(i);
                break;
            }
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                list.add(i);
                break;
            }
        }

        int[] res={-1,-1};
        int i=0;
        for(int x: list){
            res[i]=x;
            i++;
        }
    //  if(res.length != 0)
        return res;
        // else return -1;
    }
}