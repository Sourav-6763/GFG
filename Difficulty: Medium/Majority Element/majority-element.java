class Solution {
    int majorityElement(int arr[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        int max=0;
        int res=0;
        for(int i:map.keySet()){
            if( map.get(i) >arr.length/2 && max<map.get(i)){
                max=map.get(i);
                res=i;
            }
        }
        return res==0 ?-1:res;
    }
}