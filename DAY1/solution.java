

class solution {
    public static int maxprofit(int prices[]) {
        int Buyprice = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (Buyprice < prices[i]) {
                int profit = prices[i] - Buyprice;
                max_profit = Math.max(max_profit, profit);
            } else {
                Buyprice = prices[i];
            }
        }

        return max_profit;
    }

    public static void PrintArr( int arr[] ) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }

    public static void main(String[] args) {
        int prices[] = { 7, 6, 4, 3, 1 };
        PrintArr(prices);
        System.out.println();
        System.out.println(maxprofit(prices));

    }

}
