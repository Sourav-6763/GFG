class Solution {
    public int maxWater(int arr[]) {
        int left=0;
        int right=arr.length-1;
        int max=0;
        while(left<right){
            int length=right-left;
            int height=Math.min(arr[left],arr[right]);
            int contain=length*height;
            max=Math.max(max,contain);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}