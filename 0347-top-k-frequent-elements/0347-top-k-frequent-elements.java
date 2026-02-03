class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Store: number -> how many times it appears
HashMap<Integer, Integer> map = new HashMap<>();

// Count frequency of each number
for (int num : nums) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}


// Create buckets where index = frequency
// Each bucket stores numbers with that frequency
List<Integer>[] bucket = new List[nums.length + 1];


// Put numbers into their frequency bucket
for (int key : map.keySet()) {

    int freq = map.get(key);   // get frequency

    // Create list if not present
    if (bucket[freq] == null) {
        bucket[freq] = new ArrayList<>();
    }

    // Add number to its bucket
    bucket[freq].add(key);
}


// Array to store answer
int[] result = new int[k];
int index = 0;


// Traverse from highest frequency to lowest
for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

    if (bucket[i] != null) {

        // Add elements from this bucket
        for (int num : bucket[i]) {

            result[index++] = num;

            // Stop when k elements are collected
            if (index == k)
                break;
        }
    }
}

return result;

    }
}