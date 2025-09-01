class Solution {
    int maxSubarraySum(int[] arr) {
        int maxsum=arr[0];
        int csum=arr[0];
        for(int i=1;i<arr.length;i++){
            csum=Math.max(arr[i],csum+arr[i]);
            maxsum=Math.max(csum,maxsum);
        }
        return maxsum;
    }
}
