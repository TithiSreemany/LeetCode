class Solution 
{
    //Binary Search Approach
    // Time Complexity : O(log n)
    
    public int singleNonDuplicate(int[] nums) 
    {
        int low = 0;
        int high = nums.length-2;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if (nums[mid]==nums[mid^1])           //left half
                low = mid+1;
            else                            
                high=mid-1;                     //right half
        }
        return nums[low];
    }
}