class Solution 
{
    public void rotate(int[][] matrix) 
    {
        int r = matrix.length;
        int c = matrix[0].length;
        //transpose the matrix
        for(int i=0;i<r;i++)
        {
            for (int j=i;j<c;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        //reverse the rows
        for(int i=0;i<r;i++)
        {
            for(int j =0;j<c/2;j++)
            {
                int temp = matrix[i][c-j-1];
                matrix[i][c-j-1]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        
    }
}