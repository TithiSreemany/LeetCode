class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int unique=1;
        if (nums.length<=1)
            return nums.length;
        int s=1;
        int f=1;
        while(f<nums.length)
        {
            if (nums[f]==nums[f-1])
                f++;
            else
            {    
                unique++;
                nums[s]=nums[f];
                s++;
                f++;
            }
        }
        return unique;
    }
}