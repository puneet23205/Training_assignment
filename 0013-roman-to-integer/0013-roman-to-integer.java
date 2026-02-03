class Solution {
        // Map to store Roman values
    private static final Map<String, Integer> map = new HashMap<>();

    // Initialize map (runs once)
    static {

        // Single symbols
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        // Special pairs
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
    }


    public int romanToInt(String s) {

        int result = 0;   // final answer
        int i = 0;        // pointer

        // Traverse whole string
        while (i < s.length()) {

            // Try to take 2 characters (if possible)
            if (i + 1 < s.length()) {

                String two = s.substring(i, i + 2);

                // If special pair exists
                if (map.containsKey(two)) {

                    result += map.get(two);
                    i += 2;   // skip two characters
                    continue;
                }
            }

            // Otherwise take single character
            String one = s.substring(i, i + 1);

            result += map.get(one);
            i++;   // move one step
        }

        return result;
}
}