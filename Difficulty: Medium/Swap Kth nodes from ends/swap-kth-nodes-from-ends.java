/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node swapKth(Node head, int k) {
        int count=0;
        Node ptr=head;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        if (k > count || k <= 0) {
    return head; // or throw exception
}
       int  idx = count - k +1;
        ptr=head;
        for(int i=1;i<=count;i++){
            if(idx==i){
                break;
            }
            ptr=ptr.next;
        }
        Node ptr2=head;
        for(int i=1;i<=count;i++){
            if(i==k){
                break;
            }
            ptr2=ptr2.next;
        }
       int temp=ptr.data;
        ptr.data=ptr2.data;
       ptr2.data=temp;
        return head;
    }
}
