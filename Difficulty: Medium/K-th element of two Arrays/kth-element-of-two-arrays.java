class Solution {
    public int kthElement(int a[], int b[], int k) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            res.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            res.add(b[i]);
        }
        Collections.sort(res);
        return res.get(k-1);
    }
}