class Solution {
    public int solve(int n, int[] arr, int[] dp){
        dp[0] = arr[0];
        // Iterate through the input array to fill the dp array.
        for (int i = 1; i < n; i++) {
            int pick = arr[i];
            if (i > 1)
                pick += dp[i - 2];
            int nonPick = dp[i - 1];
            dp[i] = Math.max(pick, nonPick);
        }

        // The final element of the dp array contains the maximum possible sum.
        return dp[n - 1];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,0);
        return solve(n,nums,dp);
    }
}