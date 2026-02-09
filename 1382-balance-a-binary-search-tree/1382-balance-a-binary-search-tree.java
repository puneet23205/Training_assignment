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
import java.util.*;

class Solution {

    // Store inorder traversal
    private List<Integer> list = new ArrayList<>();

    // Step 1: Inorder traversal
    private void inorder(TreeNode root) {

        if (root == null) return;

        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    // Step 2: Build balanced BST
    private TreeNode build(int left, int right) {

        if (left > right) return null;

        int mid = (left + right) / 2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = build(left, mid - 1);
        root.right = build(mid + 1, right);

        return root;
    }

    // Main Function
    public TreeNode balanceBST(TreeNode root) {

        // Get sorted nodes
        inorder(root);

        // Build balanced tree
        return build(0, list.size()-1);
    }
}
