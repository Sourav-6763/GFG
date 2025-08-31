/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head){
        Node ptr=head;
        int count=0;
        while(ptr!=null){
            count++;
            ptr=ptr.next;
        }
        int div=count/2;
        ptr=head;
        int res=0;
        for(int i=1;i<=count;i++){
            if(i==div+1){
               return res=ptr.data;
              
            }
             ptr=ptr.next;
        }
        System.out.println(count);
        return res;
    }
}