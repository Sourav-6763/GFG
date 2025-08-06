class Solution {
    public int getSecondLargest(int[] arr) {
         Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        if (set.size() < 2) return -1;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
   for(int i:set){
        pq.add(i);
        if(pq.size()>2){
            pq.poll();
        }
        
    }
    return pq.peek();
    }
}