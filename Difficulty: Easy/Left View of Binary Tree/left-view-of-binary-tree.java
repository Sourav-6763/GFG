/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    ArrayList<Integer> leftView(Node root) {
     
    ArrayList<Integer> res=new ArrayList<>();
        solver(res,0,root);
        return res;
    }
    public void solver(ArrayList<Integer>res,int Idx,Node root){
        if(root==null) return ;
        if(Idx>=res.size()) res.add(root.data);
        solver(res,Idx+1,root.left);
        solver(res,Idx+1,root.right);
    }
}