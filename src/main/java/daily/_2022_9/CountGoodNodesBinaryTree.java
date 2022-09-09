package daily._2022_9;

import util.TreeNode;

public class CountGoodNodesBinaryTree {
    private int count = 1;

    public int goodNodes(TreeNode root) {
        checkNode(root.val, root.left);
        checkNode(root.val, root.right);
        return count;
    }

    private void checkNode(int max, TreeNode node) {
        if (node == null) return;
        if (node.val >= max) {
            count++;
            max = node.val;
        }
        checkNode(max, node.left);
        checkNode(max, node.right);
    }
}
