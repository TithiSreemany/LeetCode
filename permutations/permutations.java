class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        rec_perm(0, nums, ans);
        return ans;
    }
    public void rec_perm (int index, int[] nums, List<List<Integer>> ans )
    {
        // base condition
        if (index==nums.length)
        {
            List<Integer> temp = new ArrayList<>();
            for(int i=0; i<nums.length;i++)
            {
                temp.add(nums[i]);
            }
            ans.add(temp);
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            swap(nums,i,index);
            rec_perm(index+1, nums, ans);
            swap(nums,index,i);
        }
    }
    public void swap(int nums[], int a, int b)
    {
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}