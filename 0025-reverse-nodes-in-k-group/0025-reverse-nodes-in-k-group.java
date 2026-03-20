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
        
          if(head == null || k==1) return head;

          int count =0;
         ListNode temp=head;
         int i=0;
          while(temp != null && i<k){
                count++;
                temp=temp.next;
                i++;
          }

          if(count <k){
            return head;
          }

          ListNode curr =head;
          ListNode prev=null;
          ListNode nextnode = null;
           

           for(int j=0;j<k;j++){
              nextnode=curr.next;
              curr.next=prev;
              prev=curr;
              curr=nextnode;
           }

           head.next=reverseKGroup(curr,k);

           return prev;
    }
}