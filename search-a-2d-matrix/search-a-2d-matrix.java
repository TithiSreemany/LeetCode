class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        int low = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int high = (row*col)-1;
        while (low<=high)
        {
            int mid = (low+high)/2;
            if (matrix[mid/col][mid%col]>target)
                high=mid-1;
            else if (matrix[mid/col][mid%col]<target)
                low=mid+1;
            else 
                return true;
        }
        return false;
    }
}