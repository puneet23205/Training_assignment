/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) return null;

       Node temp=head;
        
        while(temp != null){
            Node copy= new Node(temp.val);
            Node front =temp.next;
            temp.next=copy;
            copy.next=front;
            temp=front;
        }

        temp =head;
        while(temp != null){
            if(temp.random != null){
            temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }

        temp=head;
        Node dummy=new Node (0);
        Node curr=dummy;
  // This is a very very imp part
        while(temp != null && temp.next != null){
            curr.next=temp.next;
            temp.next=temp.next.next;
            curr=curr.next;

            if(curr.next != null){
                curr.next=curr.next.next;
            }
           temp=temp.next;

        }

        return dummy.next;
    }
}