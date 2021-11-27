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
    public List<Integer> rightSideView(TreeNode root) 
    {
        List<Integer> rightview = new ArrayList<Integer>();
        calculate(rightview, root, 0);
        return rightview;
    }
    public void calculate(List<Integer> rightview, TreeNode root, int height)
    {
        if(root==null)
            return;
        if (height ==rightview.size())
            rightview.add(root.val);
        calculate(rightview, root.right, height+1);
        calculate(rightview, root.left, height+1);
    }
}