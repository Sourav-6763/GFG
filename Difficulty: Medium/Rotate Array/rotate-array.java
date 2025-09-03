class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n; // handle if d > n

        // Step 1: reverse first d elements
        solver(arr, 0, d - 1);
        // Step 2: reverse remaining elements
        solver(arr, d, n - 1);
        // Step 3: reverse whole array
        solver(arr, 0, n - 1);
    }

    static void solver(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}
