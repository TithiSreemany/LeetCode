class Solution 
{
    public int maximalSquare(char[][] grid) 
    {
        int r=grid.length;
        int c=grid[0].length;
        int max=0;
        int dp[][]=new int[r][c];
        for(int i=r-1;i>=0;i--)
        {
            for(int j=c-1;j>=0;j--)
            {
                if(i==r-1 || j==c-1)
                    dp[i][j]=Character.getNumericValue(grid[i][j]);
                else if (grid[i][j]=='1')
                {
                    int min=Math.min(dp[i+1][j+1], Math.min(dp[i+1][j], dp[i][j+1]));
                    dp[i][j]=min+1;
                }
                else
                    dp[i][j]=0;
                    
            }
        }
        
        for(int i=0;i<r;i++)
        {
            for (int j=0; j<c;j++)
            {
                max=Math.max(max,dp[i][j]);
                //System.out.print(dp[i][j]+" ");
            }
            //System.out.println("");
        }
        
        
        return max*max;
    }
}