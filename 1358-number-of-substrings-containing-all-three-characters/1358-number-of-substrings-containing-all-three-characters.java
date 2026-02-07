class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();

        // Store last seen index of a, b, c
        int[] lastSeen = {-1, -1, -1};

        int count = 0;

        // Traverse string
        for (int i = 0; i < n; i++) {

            // Update last seen index
            lastSeen[s.charAt(i) - 'a'] = i;

            // If all three are seen at least once
            if (lastSeen[0] != -1 &&
                lastSeen[1] != -1 &&
                lastSeen[2] != -1) {

                // Add substrings count
                count += 1 + Math.min(
                            lastSeen[0],
                            Math.min(lastSeen[1], lastSeen[2])
                         );
            }
        }

        return count;
    }
}
