class Solution {
    int missingNum(int arr[]) {
    // if(arr.length<=1) return 2;
    Arrays.sort(arr);
    int res=0;
    int j=1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=j){
           return res=j;
        }
        j++;
    }
    return arr[arr.length-1]+1;
    }
}