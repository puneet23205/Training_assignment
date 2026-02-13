/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
        
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode temp = head;
        ListNode prev = null;
        ListNode nextnode = null;

        while (temp != null) {

            nextnode = temp.next;   // save next
            temp.next = prev;       // reverse link
            prev = temp;            // move prev
            temp = nextnode;        // move temp
        }

        return prev;
    }
}
