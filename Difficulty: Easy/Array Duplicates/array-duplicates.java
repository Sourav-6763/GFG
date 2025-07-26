class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> res=new ArrayList<>();
        Set<Integer> ab=new HashSet<>();
        for(int i:arr){
            if(ab.contains(i)){
                res.add(i);
            }
            else{
                ab.add(i);
            }
        }
        return res;
    }
}