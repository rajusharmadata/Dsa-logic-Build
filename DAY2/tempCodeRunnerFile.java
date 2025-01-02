// Method to calculate the maximum subarray sum using brute force
    public static void maximumSubarraysum(int nums[]) {

        int maxsum = Integer.MIN_VALUE; // Initialize maxsum to the smallest possible integer value
        int cursum = 0; // Variable to store the current subarray sum

        // Outer loop to determine the starting point of the subarray
        for (int i = 0; i < nums.length; i++) {
            int start = i; // Starting index of the subarray

            // Inner loop to determine the ending point of the subarray
            for (int j = i; j < nums.length; j++) {
                int end = j; // Ending index of the subarray

                cursum = 0; // Reset current sum for each new subarray

                // Loop to calculate the sum of the current subarray
                for (int k = start; k <= end; k++) {
                    cursum += nums[k]; // Add each element in the subarray to cursum
                }

                // Print the sum of the current subarray
                System.out.println("Current subarray sum: " + cursum);

                // Update maxsum if the current subarray sum is greater
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