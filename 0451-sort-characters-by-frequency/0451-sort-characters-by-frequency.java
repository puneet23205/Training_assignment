// class Solution {
//     public String frequencySort(String s) {

//         // Step 1: Frequency Map
//         HashMap<Character, Integer> map = new HashMap<>();

//         for (char c : s.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }

//         // Step 2: Buckets
//         int n = s.length();
//         List<Character>[] bucket = new List[n + 1];

//         for (char c : map.keySet()) {

//             int freq = map.get(c);

//             if (bucket[freq] == null) {
//                 bucket[freq] = new ArrayList<>();
//             }

//             bucket[freq].add(c);
//         }

//         // Step 3: Build result
//         StringBuilder sb = new StringBuilder();

//         for (int i = n; i >= 1; i--) {

//             if (bucket[i] != null) {

//                 for (char c : bucket[i]) {

//                     for (int j = 0; j < i; j++) {
//                         sb.append(c);
//                     }
//                 }
//             }
//         }

//         return sb.toString();
//     }
// }
class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Character> list = new ArrayList<>(map.keySet());

        // Sort by frequency
        Collections.sort(list, (a, b) ->
            map.get(b) - map.get(a)
        );

        StringBuilder sb = new StringBuilder();

        for (char c : list) {

            int freq = map.get(c);

            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

