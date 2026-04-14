class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int cmax=0;
        int max=0;
        for(int i=0;i<k;i++){
            cmax+=arr[i];
        }
        max=cmax;
        for(int i=k;i<arr.length;i++){
            cmax+=arr[i];
            cmax-=arr[i-k];
            max=Math.max(cmax,max);
        }
        return max;
    }
}