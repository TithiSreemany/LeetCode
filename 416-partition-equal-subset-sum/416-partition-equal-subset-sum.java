class Solution 
{
    public boolean canPartition(int[] nums) 
    {
        int tsum =0;
        for(int i =0 ; i<nums.length; i++)
            tsum=tsum+nums[i];
        if (tsum%2!=0)
            return false;
        int sum = tsum/2;
        return subseq_sum(nums, sum);
    }
    public boolean subseq_sum(int[] nums, int k) 
    {
        int n =nums.length;
        boolean dp[][]=new boolean[n+1][k+1];
        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=k;j++)
            {
                if(j!=0 && i==0)
                    dp[i][j]=false;
                else if(j==0)
                    dp[i][j]=true;
                else if (nums[i-1]<=j)
                    dp[i][j]=dp[i-1][j]||dp[i-1][j-nums[i-1]];
                else
                    dp[i][j]=dp[i-1][j];
            }
        }
        return dp[n][k];
    }
}