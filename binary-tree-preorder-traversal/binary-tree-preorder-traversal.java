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
    //Iterative Approach
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> pre = new ArrayList<>();
        if(root== null)
            return pre;
        Stack <TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty())
        {
            TreeNode ele = st.pop();
            if(ele.right!=null)
                st.push(ele.right);
            if (ele.left!=null)
                st.push(ele.left);
            pre.add(ele.val);
        }
        return pre;
    }
}