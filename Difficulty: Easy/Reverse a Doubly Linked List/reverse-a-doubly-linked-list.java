/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        Node ptr=head;
        Node temp=null;
        while(ptr!=null){
            temp=ptr.prev;
            ptr.prev=ptr.next;
            ptr.next=temp;
            ptr=ptr.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }
}