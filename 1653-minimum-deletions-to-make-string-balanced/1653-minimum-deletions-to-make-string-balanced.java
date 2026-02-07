class Solution {
    public int minimumDeletions(String s) {

        int bCount = 0; // number of 'b' seen so far
        int ans = 0;    // minimum deletions needed

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'b') {
                bCount++;
            } 
            else { // ch == 'a'
                // Either delete this 'a' (ans + 1)
                // Or delete all previous 'b' (bCount)
                ans = Math.min(ans + 1, bCount);
            }
        }

        return ans;
    }
}
