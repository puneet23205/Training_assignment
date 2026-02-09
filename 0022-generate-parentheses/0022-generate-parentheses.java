import java.util.*;

class Solution {

    public void backtrack(int open, int close, int n,
                          StringBuilder sb,
                          List<String> ans) {

        // Base case: all brackets used
        if (sb.length() == 2 * n) {
            ans.add(sb.toString());
            return;
        }

        // Add '(' if available
        if (open < n) {
            sb.append('(');
            backtrack(open + 1, close, n, sb, ans);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }

        // Add ')' if valid
        if (close < open) {
            sb.append(')');
            backtrack(open, close + 1, n, sb, ans);
            sb.deleteCharAt(sb.length() - 1); // backtrack
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        backtrack(0, 0, n, new StringBuilder(), ans);

        return ans;
    }
}
