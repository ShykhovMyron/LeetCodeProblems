package easy;

import util.TreeNode;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidNode(root.val, Long.MIN_VALUE, root.left) &&
                isValidNode(Long.MAX_VALUE, root.val, root.right);
    }

    private boolean isValidNode(long lessThen, long moreThen, TreeNode root) {
        if (root == null) return true;
        if (root.val >= lessThen || root.val <= moreThen) return false;
        return isValidNode(root.val, moreThen, root.left) &&
                isValidNode(lessThen, root.val, root.right);
    }
}
