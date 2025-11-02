class Solution {
    int thirdLargest(int arr[]) {
        PriorityQueue<Integer> ab=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            ab.offer(arr[i]);
            if(ab.size()>3){
                ab.poll();
            }
        }
        return ab.peek();
    }
}