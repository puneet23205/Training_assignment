class Solution {
    public int characterReplacement(String s, int k) {
     
     HashMap<Character,Integer> map = new HashMap<>();

     int maxfreq=0;
     int maxlen=0;
     int left=0;
     int n=s.length();
    for(int right=0;right<n;right++){
       
      map.put(s.charAt(right),
                    map.getOrDefault(s.charAt(right), 0) + 1);

       maxfreq=Math.max(maxfreq,map.get(s.charAt(right)));

       if((right-left+1)- maxfreq>k){

        map.put(s.charAt(left),map.get(s.charAt(left))-1);

        if(map.get(s.charAt(left))==0){
            map.remove(s.charAt(left));
          
        }
          left++;
       }
       maxlen=Math.max(maxlen,right-left+1);
    }
    return maxlen;
}
}