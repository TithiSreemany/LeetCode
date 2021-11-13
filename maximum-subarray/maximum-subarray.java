// Kadane's Algorithm
class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int maxsofar=nums[0];
        int sumtillnow=0;
        for(int i=0;i<nums.length;i++)
        {
            sumtillnow=sumtillnow+nums[i];
            if (sumtillnow>maxsofar)
                maxsofar=sumtillnow;
            if (sumtillnow<0)
                sumtillnow=0;
            
        }
        return maxsofar;
    }
}

        
