/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if( head == null || head.next == null){
                  return false;
               }

    ListNode kachhuwa=head;
    ListNode khargosh=head;


    while(kachhuwa != null && kachhuwa.next !=null){

        khargosh=khargosh.next;
        kachhuwa=kachhuwa.next.next;

           if(kachhuwa ==khargosh){
            return true;
           }
   
    }
    return false;
    }
}