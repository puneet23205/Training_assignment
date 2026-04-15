class Solution {
    public int closestTarget(String[] words, String target, int start) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int n = words.length;

        // Forward direction
        for (int step = 0, i = start; step < n; step++, i = (i + 1) % n) {
            if (words[i].equals(target)) {
                min1 = step;                
                break;
            }
        }

        // Backward direction
        for (int step = 0, i = start; step < n; step++, i = (i - 1 + n) % n) {
            if (words[i].equals(target)) {   
                min2 = step;                
                break;
            }
        }

        int res = Math.min(min1, min2);

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}