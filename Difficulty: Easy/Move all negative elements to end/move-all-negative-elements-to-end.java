// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        ArrayList<Integer> ab=new ArrayList<>();
      for(int i:arr){
          if(i>=0){
              ab.add(i);
          }
          
      }
      for(int i:arr){
          if(i<0){
              ab.add(i);
          }
      }
     for(int i=0;i<arr.length;i++){
         arr[i]=ab.get(i);
     }
    }
}