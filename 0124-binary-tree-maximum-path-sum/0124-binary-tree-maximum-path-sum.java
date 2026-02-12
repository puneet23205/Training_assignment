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
    public int maxPathSum(TreeNode root) {
         int [] max = new int[1];
         max[0]=Integer.MIN_VALUE;
        findsum(root,max);

        return max[0];
    }

    private int findsum( TreeNode node,int[] max){

        if(node==null)  return 0;

        int lsum= Math.max(0,findsum(node.left,max));
        int rsum=Math.max(0,findsum(node.right,max));

        max[0]= Math.max(max[0],lsum+rsum+node.val);

        return node.val+ Math.max(lsum,rsum);
    }
}