/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int n1=0;
        int n2=0;
        ListNode temp = headA;
        while( temp!= null){
            n1++;
            temp=temp.next;
        }

        temp=headB;
   
        while( temp!= null){
            n2++;
            temp=temp.next;
        }

        if(n1>n2){
            return collisionpoint(headA,headB,n1-n2);
        }
        else 

             return collisionpoint(headB,headA,n2-n1);

    }

    private static ListNode collisionpoint(ListNode t1, ListNode t2,int d){

        while(d !=0){
            d--;
            t1=t1.next;
        }

        while( t1!=t2){
            t1= t1.next;
            t2=t2.next;
        }

        return t1;
    }
}