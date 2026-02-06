// class Solution {
//     public boolean isIsomorphic(String s, String t) {

//         if (s.length() != t.length())
//             return false;

//         int[] map1 = new int[256]; // s -> t
//         int[] map2 = new int[256]; // t -> s

//         // Initialize with -1
//         Arrays.fill(map1, -1);
//         Arrays.fill(map2, -1);

//         for (int i = 0; i < s.length(); i++) {

//             char c1 = s.charAt(i);
//             char c2 = t.charAt(i);

//             // If already mapped
//             if (map1[c1] != -1) {

//                 if (map1[c1] != c2)
//                     return false;

//             } else {

//                 map1[c1] = c2;
//             }

//             if (map2[c2] != -1) {

//                 if (map2[c2] != c1)
//                     return false;

//             } else {

//                 map2[c2] = c1;
//             }
//         }

//         return true;
//     }
// }

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Check s -> t
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2)
                    return false;
            } else {
                map1.put(c1, c2);
            }

            // Check t -> s
            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1)
                    return false;
            } else {
                map2.put(c2, c1);
            }
        }

        return true;
    }
}
