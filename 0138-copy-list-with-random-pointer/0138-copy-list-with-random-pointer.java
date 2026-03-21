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

        HashMap<Node, Node> map = new HashMap<>();

        Node temp = head;

        // Step 1: Create all nodes
        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // Step 2: Connect next and random
        temp = head;

        while (temp != null) {
            Node copy = map.get(temp);

            copy.next = map.get(temp.next);      // important
            copy.random = map.get(temp.random);  // important

            temp = temp.next;
        }

        return map.get(head);
    }
}