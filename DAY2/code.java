public class code {
    public static void maximumSubarraysum(int nums[]) {

        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;


        for (int i = 0; i < nums.length; i++) {
           int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                cursum = 0;
                for (int k = start; k <= end; k++) {
                    cursum += nums[k];
                }
                System.out.println("current sub array sum" + cursum);
                if (maxsum < cursum) {
                    maxsum = cursum;
                }
            }


        }
        System.out.println("Maxsum subarry is " + maxsum);
    }
    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        maximumSubarraysum(nums);
    }
}
