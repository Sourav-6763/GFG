// User function Template for Java

class Solution {
    public int[] findMaxGuests(int[] Entry, int Exit[], int N) {
        int max=0;
        // for(int i=0;i<N;i++){
        //     if(Entry[i]>max){
        //         max=Entry[i];
        //     }
        // }
        for(int i=0;i<N;i++){
            if(Exit[i]>max){
                max=Exit[i];
            }
        }
        // System.out.println(max);
        int [] ab=new int[max+1];
        for(int i=0;i<ab.length;i++){
            ab[i]=0;
        }
        for(int i=0;i<N;i++){
            int p=Entry[i];
            int q=Exit[i];
            for(int j=p;j<=q;j++){
                int val=ab[j];
                ab[j]=val+1;
            }
        }
        int Mmax=0;
        int k=0;
        for(int i=1;i<ab.length;i++){
            if(Mmax<ab[i]){
                Mmax=ab[i];
                k=i;
            }
        }
        int [] res=new int[2];
        res[0]=Mmax;
        res[1]=k;
        return res;
    }
}