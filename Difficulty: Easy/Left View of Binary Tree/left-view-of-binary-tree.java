/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    private int maxDepth=-1;
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result=new ArrayList<>();
        solver(result,root,0);
        return result;
    }
    public void solver(ArrayList<Integer>result,Node root,int Idx){
        if(root==null){
            return;
        }
        if(maxDepth<Idx){
            maxDepth=Idx;
            result.add(root.data);
        }
        if(root.left!=null) solver(result,root.left,Idx+1);
        if(root.right!=null) solver(result,root.right,Idx+1);
    }
}