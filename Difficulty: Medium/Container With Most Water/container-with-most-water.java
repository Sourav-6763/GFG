class Solution {
    public int maxWater(int arr[]) {
    int left=0;
    int right=arr.length-1;
    int max=0;
    while(left<right){
        int min=Math.min(arr[left],arr[right]);
        max=Math.max(max,min*(right-left));
        if(arr[left]<arr[right]){
            left++;
        }
        else {
            right--;
        }
        
      }
      return max;
      
    }
}