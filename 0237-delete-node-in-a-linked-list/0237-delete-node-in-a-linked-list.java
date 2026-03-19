/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
         
     

       // this is the craziest brainhack i am seeing ,its really a hack logic
         
     node.val=node.next.val;
     node.next=node.next.next;
         }
    }