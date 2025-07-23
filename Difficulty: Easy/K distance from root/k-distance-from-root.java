class Tree {
    // Recursive function to print all nodes at distance k from the root.
    ArrayList<Integer> Kdistance(Node root, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, k, result);
        return result;
    }
    
    void helper(Node root, int k, ArrayList<Integer> result) {
        if (root == null) return;
        if (k == 0) {
            result.add(root.data);
            return;
        }
        helper(root.left, k - 1, result);
        helper(root.right, k - 1, result);
    }
}
