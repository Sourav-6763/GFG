// User function Template for Java

class Solution {
    static String findMax(String N) {
        String str = String.valueOf(N);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
             arr[i] = str.charAt(i) - '0';
        }
        Arrays.sort(arr);
        StringBuilder res=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            res.append(arr[i]);
        }
        return res.toString();
    }
};