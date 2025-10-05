/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root, int k) {
            ArrayList<Integer> ab=new ArrayList<>();
        solver(root,ab);
        return ab.get(ab.size()-k);
    }
    public void solver(Node root,ArrayList<Integer>ab){
        if(root==null) return ;
        solver(root.left,ab);
        ab.add(root.data);
        solver(root.right,ab);
    }
        
    
}