class Solution {
    public int maxConsecBits(int[] arr) {
        int n=arr.length;
        int Mzero=0;
        int zero=0;
        int Mone=0;
        int one=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            Mzero=Math.max(zero,Mzero);
            }
            if(arr[i]==1){
                Mzero=Math.max(zero,Mzero);
                zero=0;
            }
            if(arr[i]==1){
                one++;
                Mone=Math.max(one,Mone);
            }
            if(arr[i]==0){
                Mone=Math.max(one,Mone);
                one=0;
            }
        }
        return Math.max(Mzero,Mone);
    }
}
