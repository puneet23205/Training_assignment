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
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
//         int n1=0;
//         int n2=0;
//         ListNode temp = headA;
//         while( temp!= null){
//             n1++;
//             temp=temp.next;
//         }

//         temp=headB;
   
//         while( temp!= null){
//             n2++;
//             temp=temp.next;
//         }

//         if(n1>n2){
//             return collisionpoint(headA,headB,n1-n2);
//         }
//         else 

//              return collisionpoint(headB,headA,n2-n1);

//     }

//     private static ListNode collisionpoint(ListNode t1, ListNode t2,int d){

//         while(d !=0){
//             d--;
//             t1=t1.next;
//         }

//         while( t1!=t2){
//             t1= t1.next;
//             t2=t2.next;
//         }
//          // if there is no intersection point t1 and t1 will traverse to the null and hence   t1 will be returned  as null only there is no need to return null seprately

//         return t1;
//     }
// }

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != temp2) {

            // If temp1 reaches end, move to headB
            temp1 = (temp1 == null) ? headB : temp1.next;

            // If temp2 reaches end, move to headA
            temp2 = (temp2 == null) ? headA : temp2.next;
        }

        return temp1; // Can be intersection node OR null
    }
}
