class Solution {
    public String largestOddNumber(String num) {
        
// logic is very simple from last traverse and  searcg for the first odd number

        int n = num.length();

        // Traverse from right
        for (int i = n - 1; i >= 0; i--) {

            int digit = num.charAt(i) - '0';

            // Check odd
            if (digit % 2 == 1) {

                return num.substring(0, i + 1);
            }
        }

        // No odd digit found
        return "";
    }
}