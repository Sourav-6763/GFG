class Solution {
    public int assignHole(int[] mices, int[] holes) {
        int max=-1;
        Arrays.sort(mices);
        Arrays.sort(holes);
        for(int i=0;i<holes.length;i++){
             max = Math.max(max, Math.abs(holes[i] - mices[i]));
        }
        return max;
    }
};