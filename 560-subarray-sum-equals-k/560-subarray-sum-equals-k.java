class Solution 
{
    public int subarraySum(int[] nums, int k) 
    {
        int count =0;
        int sum=0;
        HashMap <Integer, Integer> h = new HashMap<>();
        h.put(0,1);
        for(int i=0; i<nums.length;i++)
        {
            sum = sum+nums[i];
            if (h.containsKey(sum-k))
                count = count+h.get(sum-k);
            h.put(sum, h.getOrDefault(sum,0)+1);
        }
        return count;
    }
}