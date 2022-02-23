class Solution 
{
    public int rob(int[] nums) 
    {
        int N = nums.length;
        if (N==1)
            return nums[0];
        int temp1[] = new int [N-1];
        int temp2[] = new int [N-1];
        for(int i = 0;i<N;i++)
        {
            if (i!=0)
                temp1[i-1]=nums[i];
            if (i!=N-1)
                temp2[i]=nums[i];
        }
        return Math.max(dp(temp2), dp(temp1));
    }
    public int dp(int[] arr)
    {
        
        int l = arr.length;
        if (l==0)
            return 0;
        if (l==1)
            return arr[0];
        int dummy[] = new int [l];
        dummy[0]=arr[0];
        dummy[1]= Math.max(arr[1], arr[0]);
        
        for(int i=2;i<l;i++)
        {
            dummy[i]= Math.max(arr[i]+dummy[i-2], dummy[i-1]);
        }
        return dummy[l-1];
    }
}