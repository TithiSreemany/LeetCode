class Solution 
{
    public String longestNiceSubstring(String s) 
    {
        if (s.length() < 2) return "";
        char str[]= s.toCharArray();
        for(int i=0; i<s.length();i++)
        {
            char c=s.charAt(i);
            if (s.indexOf(Character.toLowerCase(c))!=-1 && s.indexOf(Character.toUpperCase(c)) !=-1)
                continue;
            String sub1 = longestNiceSubstring(s.substring(0, i));
            String sub2 = longestNiceSubstring(s.substring(i+1));
            return sub1.length() >= sub2.length() ? sub1 : sub2;
        }
        return s;
    }
}