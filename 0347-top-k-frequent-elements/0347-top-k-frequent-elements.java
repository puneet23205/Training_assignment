class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
       HashMap<Integer,Integer> map = new HashMap<>();

       int [] ans = new int[k];

       for(int x : nums){
        map.put(x,map.getOrDefault(x,0)+1);
       }

    int count =0;


    while(count < k){
                    int maxfreq=0;
                    int element =0;

    for ( int key : map.keySet()) {


            int freq = map.get(key);
           if(freq> maxfreq){
            maxfreq=freq;
             element =key;
           }
    }
       
     ans[count] = element;
       map.remove(element);
       count++;
    }

    return ans;

    }
}