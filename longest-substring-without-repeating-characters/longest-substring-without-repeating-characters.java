//Time Complexity : O(n)
//Space Complexity : O(n)

class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap <Character, Integer> h = new HashMap<>();
        int l=0; int r=0;
        int max = 0;
        while (r<s.length())
        {
            char ch = s.charAt(r);
            if (h.containsKey(ch))
                l= Math.max(l, h.get(ch)+1);
            h.put(ch,r);
            max=Math.max(max, (r-l+1));
            r++;
        }
        return max;
        
    }
}