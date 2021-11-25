class Solution 
{
    public int hammingDistance(int x, int y) 
    {
        int dist=0;
        int xr = x^y; // 1 in places where bits differ
        //Now simply count the number of ones (Hamming no.)
        while(xr!=0)
        {
            dist=dist+(xr&1);
            xr=xr>>>1;
        }
        return dist;
    }
}