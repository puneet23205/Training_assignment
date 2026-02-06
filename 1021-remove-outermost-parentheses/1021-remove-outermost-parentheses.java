class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {

                if (balance >= 1) {
                    result.append('(');
                }

                balance++;

            } else { // ')'

                if (balance >= 2) {
                    result.append(')');
                }

                balance--;
            }
        }

        return result.toString();
    }
}
