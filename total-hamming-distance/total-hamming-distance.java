class Solution 
{
    public int totalHammingDistance(int[] nums) 
    {
        int count=0;
        int n  = nums.length;
        for(int i=0;i<32;i++)
        {
            int bit = 0;
            for(int j=0;j<n;j++)
            {
                bit+=(nums[j]>>i)&1;
            }
            count += (n-bit)*bit;
        }
        return count;
    }
}