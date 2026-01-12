
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int i=0;
        int sum=0;
        ArrayList<Integer> ab =new ArrayList<>();
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
        while(sum>target && i<=j){
            sum-=arr[i];
                i++;
           }
        if(sum==target){
            
        
        ab.add(i+1);
        ab.add(j+1);
        return ab;
        }
        }
        ab.add(-1);
        return ab;
    }
}
