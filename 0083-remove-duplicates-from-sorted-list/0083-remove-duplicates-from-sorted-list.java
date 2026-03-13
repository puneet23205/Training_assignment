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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null|| head.next== null) return head;
        ListNode temp=head;
      
        while(temp!= null){

       while(temp.next != null && temp.val==temp.next.val)// check for temp.next because incase there is no duplication at the end node and temp is at last node then there can be problem with nullpointer exception
       {
        temp.next=temp.next.next;
       }
       temp=temp.next;
        }
        return head;
    }
}