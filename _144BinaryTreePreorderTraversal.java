import java.util.ArrayList;
import java.util.List;


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

class Solution144 {
    List<Integer> al = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return al;
        }
        al.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return al;
    }
}