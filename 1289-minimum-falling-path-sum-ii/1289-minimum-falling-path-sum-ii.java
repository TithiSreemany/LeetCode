class Solution 
{
    public int minFallingPathSum(int[][] grid) 
    {
        int n = grid.length;
        int dp[][]= new int[n][n];
        for(int i=0; i<n; i++)
        {
            dp[n-1][i]=grid[n-1][i];
        }
        for(int i=n-2; i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                int mini=99999;
                for(int k=0;k<n;k++)
                {
                    if(j!=k)
                        mini=Math.min(dp[i+1][k], mini);
                }
                dp[i][j]=grid[i][j]+mini;
            }
        }
        int min=dp[0][0];
        for(int j=0;j<n;j++)
        {
            if (dp[0][j]<min)
                min=dp[0][j];
        }
        return min;
    }
}