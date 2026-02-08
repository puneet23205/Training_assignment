/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    // Returns height if balanced, else -1
    public int height(TreeNode root) {

        // Base case
        if (root == null) return 0;

        // Left height
        int left = height(root.left);
        if (left == -1) return -1;

        // Right height
        int right = height(root.right);
        if (right == -1) return -1;

        // If unbalanced
        if (Math.abs(left - right) > 1)
            return -1;

        // Return height
        return 1 + Math.max(left, right);
    }
}
