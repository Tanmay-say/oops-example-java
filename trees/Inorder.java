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

public class Inorder {
    public static void ans(TreeNode root, List<Integer> li) {
        if (root == null) return;
        ans(root.right, li);
        li.add(root.val);
        ans(root.left, li);
        
    }

    public static void main(String[] args) {
        // Creating a tree from given post-order: 8 10 9 14 2 12 3 6 11 5 15 4 1

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(4);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(11);
        root.left.left.left.left = new TreeNode(6);
        root.left.left.left.right = new TreeNode(3);
        root.left.left.left.right.right = new TreeNode(12);
        root.left.left.left.right.right.left = new TreeNode(2);
        root.left.left.left.right.right.left.right = new TreeNode(14);
        root.left.left.left.right.right.left.left = new TreeNode(9);
        root.left.left.left.right.right.left.left.right = new TreeNode(10);
        root.left.left.left.right.right.left.left.left = new TreeNode(8);

        List<Integer> result = new ArrayList<>();
        ans(root, result);

        // Print post-order traversal result
        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}
