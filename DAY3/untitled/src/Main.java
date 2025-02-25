public class Main {

    /**
     * This method calculates the number of subarrays with an odd sum.
     * It uses a prefix sum approach and keeps track of the number of odd and even prefix sums.
     *
     * @param arr The input array of integers
     * @return The count of subarrays with an odd sum, modulo 10^9 + 7
     */
    public static int numOfSubarrays(int[] arr) {
        final int MOD = 1000000007; // Large prime number to prevent integer overflow
        int oddCount = 0, evenCount = 1; // evenCount starts at 1 to handle prefix sum cases
        int prefixSum = 0; // Stores the cumulative sum of elements
        int result = 0; // Stores the final count of subarrays with odd sums

        // Iterate through each element in the array
        for (int num : arr) {
            prefixSum += num; // Update the prefix sum with the current element

            // Check if the current prefix sum is even or odd
            if (prefixSum % 2 == 0) { // If even
                result = (result + oddCount) % MOD; // Add the count of odd prefix sums
                evenCount++; // Increment even prefix count
            } else { // If odd
                result = (result + evenCount) % MOD; // Add the count of even prefix sums
                oddCount++; // Increment odd prefix count
            }
        }
        return result; // Return the total count of subarrays with an odd sum
    }

    /**
     * Main method to test the numOfSubarrays function
     */
    public static void main(String[] args) {
        int arr[] = {1, 3, 5}; // Test input array
        System.out.println(numOfSubarrays(arr)); // Print the output
    }
}
