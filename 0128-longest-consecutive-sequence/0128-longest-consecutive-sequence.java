class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Put all elements in set
        for (int x : nums) {
            set.add(x);
        }

        int max = 0;

        // Traverse through set
        for (int num : set) {

            // Check if num is start of sequence
            if (!set.contains(num - 1)) {

                int curr = num;
                int count = 1;

                // Grow sequence
                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}

