class Solution 
{
    public int lengthOfLIS(int[] nums) 
    {
        int n =nums.length;
        int dp[]=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=1; i<=n;i++)
        {
            int max=0;
            for(int j = 1; j<i;j++)
            {
                if(nums[j-1]<nums[i-1])
                    max=max>=dp[j]?max:dp[j];
            }
            dp[i]=max+1;
        }
        int l = 0;
        for(int i=1; i<=n;i++)
        {
            l=dp[i]>l?dp[i]:l;
        }
        return l;
    }
}