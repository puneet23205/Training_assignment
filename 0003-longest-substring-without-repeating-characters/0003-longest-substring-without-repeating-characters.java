import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

           HashMap<Character,Integer> map= new HashMap<>();
           int maxlen=0;
           int len=0;
           int n=s.length();
           int left=0;
           for(int right=0;right<n;right++){

                  char c = s.charAt(right);

            if(map.containsKey(c)){

                left=Math.max(left,map.get(c)+1);
            }
            //update the index
            map.put(c,right);

            maxlen=Math.max(maxlen,right-left+1);
           }
           return maxlen;
    }
}
