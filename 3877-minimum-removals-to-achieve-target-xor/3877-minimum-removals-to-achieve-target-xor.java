class Solution {
    public int minRemovals(int[] nums, int target) {

        int totalxor=0;
        for(int x: nums){
            totalxor ^=x;
        }

        if(totalxor == target){
            return 0;
        }

        int requiredxor=totalxor ^target;

        return findsteps(nums,requiredxor);
    }

    public static int findsteps(int [] nums,int targetxor){
        Queue<Integer> q= new LinkedList<>();
        Map<Integer,Integer> distance= new HashMap<>();

        q.offer(0);
        distance.put(0,0);

        while(! q.isEmpty()){
            int currxor=q.poll();
            int steps=distance.get(currxor);

            if(currxor == targetxor) {
                return steps;
            }

            for(int num : nums){
                int newxor=currxor^num;
                if(!distance.containsKey(newxor)){
                     distance.put(newxor, steps + 1);
                    q.offer(newxor);
                }
            }
        }
        return -1;
    }
}