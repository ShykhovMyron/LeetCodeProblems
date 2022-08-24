package leetcode75.second;

import util.TreeNode;

public class InvertBinaryTree {
  private TreeNode left;
  private TreeNode right;

  public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;
    left = root.left;
    right = root.right;
    root.left = right;
    root.right = left;
    if (root.left != null) invertTree(root.left);
    if (root.right != null) invertTree(root.right);
    return root;
  }
}
