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
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> inorder = new ArrayList<Integer>();
        recursive(root, inorder);
        return inorder;
    }
    public void recursive(TreeNode root, List<Integer> inorder)
    {
        if (root== null)
            return;
        if (root.left!= null)
            recursive(root.left,inorder );
        inorder.add(root.val);
        if (root.right!= null)
            recursive(root.right, inorder);
    }
}