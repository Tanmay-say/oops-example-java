import java.util.*;

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

public class PreOrderTree {
    public static void ans(TreeNode root, List<Integer> li) {
        if (root == null) return;
        ans(root.right, li);
        ans(root.left, li);
        li.add(root.val);
    }

    public static void main(String[] args) {
        // Creating a tree from given post-order: 8 10 9 14 2 12 3 6 11 5 15 4 1

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

        List<Integer> result = new ArrayList<>();
        ans(root, result);

        // Print post-order traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
