class Solution 
{
    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int s= triangle.size();
        int dp[][]=new int [s][s];
        for(int i=0; i<s;i++)
        {
            dp[s-1][i]=triangle.get(s-1).get(i);
        }
        for(int i=s-2; i>=0;i--)
        {
            for(int j=0;j<=i;j++)
            {
                dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i+1][j], dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}