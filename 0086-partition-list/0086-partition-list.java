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
    public ListNode partition(ListNode head, int x) {
         
         ListNode dummy1 =new ListNode(0);
         ListNode lesslist=dummy1;
         ListNode dummy2= new ListNode(0);
         ListNode greaterlist=dummy2;

         ListNode temp=head;
         while(temp != null){
             
             if(temp.val<x){
            lesslist.next=temp;
            lesslist=lesslist.next;
            temp=temp.next;
             }
             else if (temp.val >= x){
                greaterlist.next=temp;
                greaterlist=greaterlist.next;
                temp=temp.next;
             }
         }
        lesslist.next=dummy2.next;
 /* After processing all nodes:

less list: 1 -> 2 -> 2

greater list: 4 -> 3 -> 5 -> 2

Wait! Do you see the problem? The greater list still has node 2 at the end, but that node 2 still has its original next pointer! */

         greaterlist.next=null;

         return dummy1.next;
    }
}