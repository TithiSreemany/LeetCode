class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List <int []> l = new ArrayList<>();
        int lower = intervals[0][0];
        int upper =  intervals[0][1];
        for (int i=1;i<intervals.length;i++)
        {
            if (upper >= intervals[i][0])
                upper = Math.max(upper,intervals[i][1]);
            else
            {
                int a[] = {lower, upper};
                l.add(a);
                lower = intervals[i][0];
                upper = intervals[i][1];
            }
            
        }
        
        int a[] = {lower, upper};
        if (l.isEmpty() || l.get(l.size()-1) != a)
            l.add(a);
        int res[][] = new int [l.size()][2];
        for (int i=0;i<l.size();i++)
        {
            res[i]= l.get(i);
        }
        return res;
    }
}