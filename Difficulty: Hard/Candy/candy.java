// User function Template for Java

class Solution {
    static int minCandy(int arr[]) {
        int n=arr.length;
        ArrayList<Integer> left=new ArrayList<>(Collections.nCopies(n,1));
        ArrayList<Integer> right=new ArrayList<>(Collections.nCopies(n,1));
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                int val=left.get(i-1);
                left.set(i,val+1);
            }
        }
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                int val=right.get(i+1);
                right.set(i,val+1);
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            int max=Math.max(left.get(i),right.get(i));
            res+=max;
        }
        return res;
    }
}
