class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer>ab =new ArrayList<>();
        for(int i=0;i<arr.length;i++){
             boolean leader=true;
            for(int j=i+1;j<arr.length;j++){
               
                if(arr[j]>arr[i]){
                    leader=false;
                    
                }
            }
            if(leader){
                ab.add(arr[i]);
            }
        }
        
        return ab;
    }
}
