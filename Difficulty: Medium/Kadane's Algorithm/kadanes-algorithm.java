class Solution {
    int maxSubarraySum(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        int sum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=Math.max(arr[i],sum+arr[i]);
            // if(sum<0){
            //     sum=0;
            // }
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
