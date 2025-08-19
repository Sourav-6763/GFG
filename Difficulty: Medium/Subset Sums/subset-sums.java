// User function Template for Java//User function Template for Java
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
       ArrayList<Integer> res = new ArrayList<>();
        solver(arr,0,res,0);
      
        return res;
        
    }
     public void solver(int[] arr, int idx,ArrayList<Integer> res,int sum) {
        if(idx==arr.length){
            res.add(sum);
            return;
        }
        solver(arr,idx+1,res,sum+arr[idx]);
        solver(arr,idx+1,res,sum);
    }
}