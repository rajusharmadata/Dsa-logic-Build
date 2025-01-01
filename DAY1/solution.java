class Solution {
    
    // Method to find the maximum profit from a given array of prices
    public static int maxprofit(int prices[]) {
        int Buyprice = Integer.MAX_VALUE; // Initialize Buyprice to the maximum integer value
        int max_profit = 0; // Initialize max_profit to 0

        // Loop through all the prices in the array
        for (int i = 0; i < prices.length; i++) {
            // If Buyprice is less than the current price, calculate profit
            if (Buyprice < prices[i]) {
                int profit = prices[i] - Buyprice; // Calculate profit
                max_profit = Math.max(max_profit, profit); // Update max_profit if current profit is higher
            } else {
                Buyprice = prices[i]; // Update Buyprice to the current price
            }
        }

        return max_profit; // Return the maximum profit
    }

    // Method to print all the elements of an array
    public static void PrintArr(int arr[]) {
        // Loop through all the elements in the array and print them
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        int prices[] = { 7, 6, 4, 3, 1 }; // Sample array of prices
        PrintArr(prices); // Print the array of prices
        System.out.println(); // Print a new line for better readability
        System.out.println(maxprofit(prices)); // Print the maximum profit
    }

}
