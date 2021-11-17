class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        //Boyer Moore Voting Algo
        int num1 =-1;
        int num2=-1;
        int count1=0;
        int count2=0;
        for(int num : nums)
        {
            if (num1==num)
                count1++;
            else if(num2==num)
                count2++;
            else if (count1==0)
            {
                num1=num;
                count1++;
            }
            else if (count2==0)
            {
                num2=num;
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
         List<Integer> majority = new ArrayList<>();
        int c1=0;
        int c2=0;
        for(int num :nums)
        {
            if(num==num1)
                c1++;
            if (num==num2)
                c2++;
        }
        
        if (c1>Math.floor(nums.length/3))
            majority.add(num1);
        if (c2>Math.floor(nums.length/3) && (num1 != num2))
            majority.add(num2);
        return majority;
    }
}