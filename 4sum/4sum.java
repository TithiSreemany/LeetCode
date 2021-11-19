class Solution 
{
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums ==null || nums.length<4)
            return res;
        Arrays.sort(nums);
        for(int i=0; i<nums.length;i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
                int sum = nums[i]+nums[j];
                int rem = target -sum;
                int left = j+1;
                int right = nums.length-1;
                while(left<right)
                {
                    if (nums[left]+nums[right]==rem)
                    {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        res.add(temp);
                        while(left<right && nums[left]==temp.get(2))
                            left++;
                        while (left<right && nums[right]==temp.get(3))
                            right--;
                    }
                    else if (nums[left]+nums[right]>rem)
                        right--;
                    else
                        left++;     
                }
                while (j+1<nums.length && nums[j]==nums[j+1])
                            j++;
            }
            while (i+1<nums.length && nums[i]==nums[i+1])
                            i++;
            
        }
        return res;
    }
}