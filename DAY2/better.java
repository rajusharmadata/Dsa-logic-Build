public class better {
    // Method to calculate the maximum subarray sum using brute force
    public static void maximumSubarraysum(int nums[]) {

        int maxsum = Integer.MIN_VALUE; // Initialize maxsum to the smallest possible integer value
        int cursum = 0; // Variable to store the current subarray sum
        int prifix[] = new int[nums.length];
         prifix[0] = nums[0];
        for(int k = 1;k<nums.length;k++){
            prifix[k] = prifix[k-1] + nums[k];
        }

        // Outer loop to determine the starting point of the subarray
        for (int i = 0; i < nums.length; i++) {
            int start = i; // Starting index of the subarray

            // Inner loop to determine the ending point of the subarray
            for (int j = i; j < nums.length; j++) {
                int end = j; // Ending index of the subarray

                cursum = start == 0 ? prifix[end] : prifix[end] - prifix[start - 1];
                if (maxsum < cursum) {
                    maxsum = cursum;
                }
            }

        }

        // Print the maximum subarray sum
        System.out.println("Maximum subarray sum is: " + maxsum);
    }

    // Main method to test the maximumSubarraysum function
    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // Input array
        maximumSubarraysum(nums); // Call the function with the input array
    }
}
