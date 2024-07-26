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

public class Height {
    public static int height(TreeNode root) {
        if (root == null) return -1;
        int lf = height(root.left); // left height 
        int rf = height(root.right); // right height
        return Math.max(lf , rf) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(14);
        root.left.right.left = new TreeNode(9);
        root.left.right.left.left = new TreeNode(10);
        root.right.right = new TreeNode(15);
        root.right.right.left = new TreeNode(5);
        root.right.right.left.right = new TreeNode(11);
        root.right.right.left.right.left = new TreeNode(3);
        root.right.right.left.right.left.left = new TreeNode(12);
        root.right.right.left.right.right = new TreeNode(6);

        System.out.println(height(root));
    } 
}
