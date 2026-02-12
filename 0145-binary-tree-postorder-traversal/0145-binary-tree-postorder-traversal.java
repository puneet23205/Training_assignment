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
// class Solution {
// List<Integer> ans= new ArrayList<>();

//     public List<Integer> postorderTraversal(TreeNode root) {
        
//         postorder(root);

//         return ans;
//     }

//     private void postorder( TreeNode node){

//          if(node == null ) return;
//         //traverse to extreme left
//         postorder(node.left);

//         //traverse to the extreme right of that subtree 
//         postorder( node.right);

//         // print the node value
//         ans.add(node.val);
//     }
// }
        //Traversal using two stack
 
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        if(root==null) return ans;
        st1.add(root);

        while(!st1.isEmpty()){

             TreeNode curr = st1.pop();

            st2.add(curr.val);

            if(curr.left!= null){
                st1.add(curr.left);
            }
            if(curr.right!=null){
                st1.add(curr.right);
            }
        }
         while(!st2.isEmpty()){
            ans.add(st2.pop());
        }
        return ans;
    }
 }