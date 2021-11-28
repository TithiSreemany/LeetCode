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
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> pre = new ArrayList<>();
        Stack <TreeNode> st = new Stack<>();
        if (root==null)
            return pre;
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode ele= st.pop();
            pre.add(ele.val);
            if (ele.right!=null) st.push(ele.right);
            if (ele.left!=null) st.push(ele.left);
        }
        return pre;
    }
}