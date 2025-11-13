// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        int ans=0;
        while(n>0){
            int rev=n%10;
            ans=ans*10+rev;
            n=n/10;
        }
        return ans;
    }
}