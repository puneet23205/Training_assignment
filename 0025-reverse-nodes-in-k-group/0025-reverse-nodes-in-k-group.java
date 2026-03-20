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
    public ListNode reverseKGroup(ListNode head, int k) {
        
                // Base case: if list is empty or k is 1, no reversal needed
        if (head == null || k == 1) {
            return head;
        }
        
        // Step 1: Check if we have at least k nodes
        ListNode temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }
        
        // If less than k nodes, return head as is
        if (count < k) {
            return head;
        }
        
        // Step 2: Reverse k nodes
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextNode = null;
        
        for (int i = 0; i < k; i++) {
            nextNode = curr.next;  // Store next node
            curr.next = prev;       // Reverse the link
            prev = curr;            // Move prev forward
            curr = nextNode;        // Move curr forward
        }
        
        // Step 3: Recursively reverse remaining nodes
        // head is now the last node of reversed group
        // Connect it to the result of the next group
        head.next = reverseKGroup(curr, k);
        
        // Step 4: Return the new head of this reversed group
        return prev;
    }
}