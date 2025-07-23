class Tree {
 ArrayList<Integer> Kdistance(Node root, int k) {
        ArrayList<Integer> ab=new ArrayList<>();
        solver(root,ab,k,0);
        return ab;
    }
    public void solver(Node root,ArrayList<Integer>ab,int k,int level){
        if(root==null)return ;
        if(level==k) ab.add(root.data);
        solver(root.left,ab,k,level+1);
        solver(root.right,ab,k,level+1);
    }
   
}
