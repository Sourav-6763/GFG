/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
    ArrayList<Integer> ab=new ArrayList<>();
    Node ptr=head;
    while(ptr!=null){
        ab.add(ptr.data);
        ptr=ptr.next;
    }
    Collections.sort(ab);
    Node demo=new Node(-1);
    ptr=demo;
    for(int i=0;i<ab.size();i++){
        Node temp=new Node(ab.get(i));
        ptr.next=temp;
        ptr=ptr.next;
    }
    // System.out.println(ab);
    return demo.next;
    }
}