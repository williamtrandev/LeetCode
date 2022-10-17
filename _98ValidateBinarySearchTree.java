
 // Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution98 {
    private boolean isValidBST(TreeNode root, TreeNode minNode, TreeNode maxNode) {
        if(root == null) 
            return true;
        if(minNode != null && root.val <= minNode.val || maxNode != null && root.val >= maxNode.val) {
            return false; 
        }
        return isValidBST(root.left, minNode, root) && isValidBST(root.right, root, maxNode);
    }
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
}