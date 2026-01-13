class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> ab=new ArrayList<>();
        int i=0;int j=0;
        ab.add(arr[j]);
        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            }else{
                i++;
                arr[i]=arr[j];
                ab.add(arr[j]);
                j++;
            }
        }
        return ab;
    }
}
