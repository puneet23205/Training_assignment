class Solution {
    public int beautySum(String s) {

        int n = s.length();
        int ans = 0;

        // Fix starting index
        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];

            // Extend substring
            for (int j = i; j < n; j++) {

                char c = s.charAt(j);
                freq[c - 'a']++;

                int max = 0;
                int min = Integer.MAX_VALUE;

                // Find max and min freq
                for (int k = 0; k < 26; k++) {

                    if (freq[k] > 0) {

                        max = Math.max(max, freq[k]);
                        min = Math.min(min, freq[k]);
                    }
                }

                ans += (max - min);
            }
        }

        return ans;
    }
}
