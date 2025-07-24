class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        Set<Integer> ab=new HashSet<>();
       
        for(int i:arr){
            ab.add(i);
        }
         ArrayList<Integer> res =new ArrayList<>(ab);
        // System.out.println(ab);
        Collections.sort(res);
        return res;
    }
}
