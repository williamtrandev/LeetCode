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

class Solution2331 {
    public boolean evaluateTree(TreeNode root) {
        if(root == null) {
            return true;
        }
        if(root.val == 2) {
            return evaluateTree(root.left) || evaluateTree(root.right);
        } else if(root.val == 3) {
            return evaluateTree(root.left) && evaluateTree(root.right);
        } else if(root.val == 1) {
            return true;
        } else {
            return false;
        }
    }
}