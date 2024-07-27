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
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        DiaPair nn = diam(root);
        return nn.diameter;
    }

    public DiaPair diam(TreeNode root) {
        if (root == null) {
            return new DiaPair();
        }

        DiaPair lf = diam(root.left);
        DiaPair rt = diam(root.right);

        DiaPair self = new DiaPair();
        self.diameter = Math.max(lf.diameter, Math.max(lf.height + rt.height + 2, rt.diameter));
        self.height = Math.max(lf.height, rt.height) + 1;

        return self;
    }

    class DiaPair {
        int height = -1;
        int diameter = 0;
    }
}


/* There is no restriction on data members */