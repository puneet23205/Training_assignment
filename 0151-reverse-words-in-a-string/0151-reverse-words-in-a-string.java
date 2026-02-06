class Solution {
    public String reverseWords(String s) {

        StringBuilder result = new StringBuilder();

        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            int j = i;

            // Move till word ends
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Extract word
            result.append(s.substring(i + 1, j + 1));
            result.append(" ");
        }

        return result.toString().trim();
    }
}
