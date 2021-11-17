class Solution 
{
    public double myPow(double x, int n) 
    {
        long nn = n;
        double ans=1;
        int flag = 0;
        if (nn<0)
        {
            flag++;
            nn=nn*(-1);
        }
        while(nn>0)
        {
            if (nn%2==0)
            {   
                nn=nn/2;
                x=x*x;
            }
            else
            {
                nn=nn-1;
                ans=ans*x;
            }    
        }
        if (flag==0)
            return ans;
        else
            return 1/ans;
    }
}