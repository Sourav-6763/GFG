class Solution {
    // Function to calculate factorial of a number.
    int factorial(int n) {
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
}
