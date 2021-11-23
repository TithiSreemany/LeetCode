class Solution 
{
    public int countPrimes(int n) 
    {
        // Sieve of Eratosthenes
        // O(N log log N)
        boolean a[]=new boolean [n];
        int count = 1;
        if (n<=2)
            return 0;
        for (int i = 2; i < Math.sqrt(n); i++)
        {
            if (a[i]==false)
            {
                for(int j = i*i; j<n; j=j+i)
                    a[j]=true;
            }
        }
        for (int i = 3; i < n; i=i+2)
        {
            if (a[i]==false)
            {
                count++;
            }
        }
        return count;
    }
}