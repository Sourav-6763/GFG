/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        for(int i:b){
            if(set.contains(i)){
                set.remove(i);
            }
        }
        int res=0;
        ArrayList<Integer> ab=new ArrayList<>(set);
        for(int i=0;i<a.length;i++){
            if(ab.get(0)==a[i]){
                res=i;
            }
        }
    return res;
    }
}