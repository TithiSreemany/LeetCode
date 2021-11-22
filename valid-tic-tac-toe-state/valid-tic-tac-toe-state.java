class Solution 
{
    public boolean validTicTacToe(String[] board) 
    {
        boolean xwins=false;
        boolean owins= false;
        int rows[] = new int[3];
        int col[]=new int[3];
        int diag = 0;
        int antidiag = 0;
        int turn=0 ;
        // Turn = 1  --> X plays
        // Turn = 0  --> O plays
        for (int i=0;i<board.length;i++)
        {
            for (int j= 0; j<board[i].length();j++)
            {
                if (board[i].charAt(j)=='X')
                {
                    rows[i]++;
                    col[j]++;
                    if (i==j)
                        diag++;
                    if (i+j==2)
                        antidiag++;
                    turn++;
                }
                else if (board[i].charAt(j)=='O')
                {
                    rows[i]--;
                    col[j]--;
                    if (i==j)
                        diag--;
                    if (i+j==2)
                        antidiag--;
                    turn--;
                }
            }
        }
        
        if (rows[0]==3 || rows[1]==3 || rows[2]==3 || col[0]==3|| col[1]==3 ||col[2]==3 || diag==3 || antidiag==3)
            xwins = true;
        if (rows[0]==-3 || rows[1]==-3 || rows[2]==-3 || col[0]==-3|| col[1]==-3 ||col[2]==-3 || diag==-3 || antidiag==-3)
            owins = true;
        
        if ((xwins && turn!=1)|| (owins && turn!=0))
            return false;
        
        return(turn ==0 || turn ==1);
            
    }
}