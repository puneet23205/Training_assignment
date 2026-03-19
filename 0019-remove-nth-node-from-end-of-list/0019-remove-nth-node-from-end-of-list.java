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
    public ListNode removeNthFromEnd(ListNode head, int n) {
   ListNode temp=head;
    int length =0;
    while(temp != null){
        length++;
        temp=temp.next;
    }
    
   temp=head;
     if( length == n) return head.next;
      int pos1= length-n;
      int pos2 =1;
       while(temp != null){
   
          if(pos2 == pos1){
            temp.next=temp.next.next;
            break;
          }
         temp=temp.next;
         pos2++;
       }

       return head;
    }

}