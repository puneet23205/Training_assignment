/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        buildParentMap(root, parentMap);
        
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        
        q.offer(target);
        visited.add(target);
        
        int distance = 0;
        
        while (!q.isEmpty()) {
            
            int size = q.size();
            
            if (distance == k) break;
            
            distance++;
            
            for (int i = 0; i < size; i++) {
                
                TreeNode current = q.poll();
                
                // left child
                if (current.left != null && !visited.contains(current.left)) {
                    visited.add(current.left);
                    q.offer(current.left);
                }
                
                // right child
                if (current.right != null && !visited.contains(current.right)) {
                    visited.add(current.right);
                    q.offer(current.right);
                }
                
                // parent
                if (parentMap.containsKey(current) && 
                    !visited.contains(parentMap.get(current))) {
                    
                    visited.add(parentMap.get(current));
                    q.offer(parentMap.get(current));
                }
            }
        }
        
        List<Integer> result = new ArrayList<>();
        
        while (!q.isEmpty()) {
            result.add(q.poll().val);
        }
        
        return result;
    }
    
    
    private void buildParentMap(TreeNode root, 
                                Map<TreeNode, TreeNode> parentMap) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while (!q.isEmpty()) {
            TreeNode current = q.poll();
            
            if (current.left != null) {
                parentMap.put(current.left, current);
                q.offer(current.left);
            }
            
            if (current.right != null) {
                parentMap.put(current.right, current);
                q.offer(current.right);
            }
        }
    }
}
