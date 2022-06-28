class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        int l = nums.length;
        if(l==1)
            return;
        k=k%l;
        reverse(nums, 0, l-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, l-1);
    }
    public void reverse(int[] nums, int s, int l)
    {
        while(s<l)
        {
            int temp=nums[s];
            nums[s]=nums[l];
            nums[l]=temp;
            s++;
            l--;
        }
    }
}