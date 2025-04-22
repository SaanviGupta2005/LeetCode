class Solution {
    public int lengthOfLIS(int[] nums) {

        int dp[]= new int[nums.length];
        Arrays.fill(dp,1);
        for( int i=1;i<nums.length;i++){
            for( int j=0;j<i;j++){
                if( nums[j]<nums[i] && dp[i]<1+dp[j]){
                    dp[i]= 1+dp[j];
                }
            }
        }
        int max=0;
        for( int i=0;i<dp.length;i++){
            max= Math.max(dp[i],max);
        }
        return max;
    }
}