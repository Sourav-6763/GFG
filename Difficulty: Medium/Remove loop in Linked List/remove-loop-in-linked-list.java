/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                slow=head;
                while(slow!=fast){
                    fast=fast.next;
                    slow=slow.next;
                }
                Node ptr=slow;
                while(ptr.next!=slow){
                    ptr=ptr.next;
                }
                ptr.next=null;
                break;
            }
        }
    }
}