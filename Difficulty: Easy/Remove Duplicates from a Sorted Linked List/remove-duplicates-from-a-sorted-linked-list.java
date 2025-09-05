/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        Node ptr=head;
        while(ptr!=null){
            Node next=ptr.next;
            while(next !=null && ptr.data==next.data){
                next=next.next;
            }
            ptr.next=next;
            ptr=ptr.next;
        }
        return head;
    }
}

