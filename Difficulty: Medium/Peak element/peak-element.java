class Solution {
    public int peakElement(int[] arr) {
        int n=arr.length;
        if(n==1) return 0;
            if(arr[0]>arr[1]){
                return 0;
          
        }
       for(int i=1;i<arr.length-1;i++){
           if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
               return i;
           }
       }
       return n-1;
    }
}