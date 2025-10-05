/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        ArrayList<Integer> ab=new ArrayList<>();
        solver(root,ab);
        for(int i=1;i<ab.size();i++){
            if(ab.get(i-1)>ab.get(i)){
                return false;
            }
        }
        return true;
    }
    public void solver(Node root,ArrayList<Integer>ab){
        if(root==null) return ;
        solver(root.left,ab);
        ab.add(root.data);
        solver(root.right,ab);
    }
}