class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        ArrayList<Integer> l = new ArrayList<>();
        int top =0; int down = matrix.length-1;
        int left = 0; int right = matrix[0].length-1;
        int dir =0;
        // dir = 0 --> right
        // dir = 1 --> Down
        // dir = 2 --> left
        // dir = 3 --> Up
        
        while(left<=right && top<=down)
        {
            if (dir == 0)   //Moving right
            {
                for (int i = left ; i <=right; i++)
                    l.add(matrix[top][i]);
                top++;
            }
            else if (dir == 1)   //Moving Down
            {
                for (int i = top ; i <=down; i++)
                    l.add(matrix[i][right]);
                right--;
            }
            else if (dir == 2)   //Moving left
            {
                for (int i = right ; i >=left; i--)
                    l.add(matrix[down][i]);
                down--;
            }
            else if (dir == 3)   //Moving up
            {
                for (int i = down ; i >=top; i--)
                    l.add(matrix[i][left]);
                left++;
            }
            dir = (dir+1)%4;
        }
        return l;
    }
}