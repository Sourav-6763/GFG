/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    
    static class Pair {
    Node node;
    int Idx;
    Pair(Node n, int i) {
        node = n;
        Idx = i;
    }
}

    
    
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ab=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair cur=q.poll();
            Node node=cur.node;
            int Idx=cur.Idx;
        
        if(!map.containsKey(Idx)){
            map.put(Idx,node.data);
        }
        
       if(node.left!=null) q.add(new Pair(node.left,Idx-1));
       if(node.right!=null) q.add(new Pair(node.right,Idx+1));
        }
      ab.addAll(map.values());
       return ab;
       
       
    }
}