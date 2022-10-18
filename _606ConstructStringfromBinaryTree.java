
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
 
class Solution606 {
    public String tree2str(TreeNode root) {
        if(root == null) {
            return "";
        }
        String ans = root.val + "";
        String left = tree2str(root.left);
        String right = tree2str(root.right);
        if(left.equals("") && right.equals("")) {
            return ans;
        } else if(left.equals("")) {
            return ans + "()" + "(" + right + ")";
        } else if(right.equals("")){
            return ans + "("+ left + ")";
        } else {
            return ans + "(" + left + ")" + "(" + right + ")";
        }
    }
}