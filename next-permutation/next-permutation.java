class Solution 
{
    public void nextPermutation(int[] nums) 
    {
        if (nums.length<=1)
            return;
        int i= nums.length-2;
        while( i>=0 && (nums[i]>=nums[i+1]))
            i--;
        if(i>=0)
        {
            int j =nums.length-1;
            while(j>=0 && nums[j]<=nums[i])
                j--;
            swap(nums, i, j);
        }
        reverse (nums, i+1, nums.length-1 );     
    }
    public void swap(int [] nums, int a, int b )
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void reverse(int[] nums, int l, int u)
    {
        while(l<u)
            swap(nums, l++,u--);
    }
}