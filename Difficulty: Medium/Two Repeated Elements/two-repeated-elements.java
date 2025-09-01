class Solution {
    public int[] twoRepeated(int[] arr) {
        int [] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0;
        for(int i:arr){
            if(map.containsKey(i)){
                res[j]=i;
                j++;
                // map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        // System.out.println(map);
        return res;
    }
}