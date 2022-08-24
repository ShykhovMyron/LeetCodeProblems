package util;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode() {}

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public static TreeNode arrayToTree(int[] array) {
    if (array == null || array.length == 0) {
      return null;
    }
    return arrayToTree(array, 0);
  }

  private static TreeNode arrayToTree(int[] array, int root) {
    if (root >= array.length) {
      return null;
    }
    return new TreeNode(
        array[root], arrayToTree(array, (root * 2) + 1), arrayToTree(array, (root * 2) + 2));
  }
}
