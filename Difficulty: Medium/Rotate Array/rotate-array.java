// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int nums[], int k) {
        ArrayList<Integer> ab=new ArrayList<>();
        int length=nums.length;
        if(length==1)return;
        k=k%length;
        for(int i=0;i<nums.length;i++){
            if(i>=k){
                ab.add(nums[i]);
            }
        }
        
        for(int i=0;i<k;i++){
            if(i<k){
                ab.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=ab.get(i);
        }
    }
    
}