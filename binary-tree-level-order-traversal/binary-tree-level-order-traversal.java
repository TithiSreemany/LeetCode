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

// Time complexity : O(n)
// Space Complexity : O(n)
class Solution 
{
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        Queue <TreeNode> q = new LinkedList<>();
        List<List<Integer>> lev = new ArrayList<>();
        if (root == null)
            return lev;
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer> row = new ArrayList<>();
            int n = q.size();
            for (int i=0; i<n;i++)
            {
                if (q.peek().left!=null)
                    q.offer(q.peek().left);
                if (q.peek().right!=null)
                    q.offer(q.peek().right);
                row.add(q.poll().val);
            }
            lev.add(row);
        }
        return lev;
    }
}