class Solution {
    public int getSecondLargest(int[] arr) {
        HashSet<Integer> ab=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            ab.add(arr[i]);
        }
          if (ab.size() < 2) {
            return -1; // or throw an exception
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int u:ab){
            pq.offer(u);
            if(pq.size()>2){
                pq.remove();
            }
        }
        return pq.poll();
    }
}