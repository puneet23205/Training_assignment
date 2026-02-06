class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] map1 = new int[256]; // s -> t
        int[] map2 = new int[256]; // t -> s

        // Initialize with -1
        Arrays.fill(map1, -1);
        Arrays.fill(map2, -1);

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If already mapped
            if (map1[c1] != -1) {

                if (map1[c1] != c2)
                    return false;

            } else {

                map1[c1] = c2;
            }

            if (map2[c2] != -1) {

                if (map2[c2] != c1)
                    return false;

            } else {

                map2[c2] = c1;
            }
        }

        return true;
    }
}
