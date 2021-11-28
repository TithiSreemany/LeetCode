/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> zz = new ArrayList<>();
        Queue <TreeNode> q = new LinkedList<>();
        int flag =0;
        if(root==null)
            return zz;
        q.offer(root);
        while (!q.isEmpty())
        {
            List<Integer> temp = new ArrayList<>();
            int n = q.size();
            for(int i=0;i<n;i++)
            {
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                temp.add(q.poll().val);
            }
            if (flag%2==0)
                zz.add(temp);
            else
            {
                Collections.reverse(temp);
                zz.add(temp);
            }
            flag++;
        }
        return zz;
    }
}