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
    public List<List<Integer>> levelOrder(TreeNode root) {

// we have to return a list of all the nodes at each level so we create an arraylist for it of type node 
     
      List <List<Integer>> ans = new ArrayList<>();

      Queue<TreeNode> q= new LinkedList<>();
      if(root== null) return ans;
      
      q.add(root);

      while(!q.isEmpty()){

        int size=q.size();
         
         List <Integer> levelnodes= new ArrayList<>();

         for(int i=0;i<size;i++){

            TreeNode curr = q.poll();

            levelnodes.add(curr.val);
            
            if(curr.left!= null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
         }
        ans.add(levelnodes);

      }
        return ans;
    }
}