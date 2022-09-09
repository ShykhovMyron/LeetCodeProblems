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

//  public static TreeNode listToTree(List<Integer> list) {
//    if (list.isEmpty() || list.get(0)==null) return null;
//    TreeNode root = new TreeNode(list.remove(0));
//    TreeNode current;
//    Deque<TreeNode> deque = new ArrayDeque<>();
//    deque.add(root);
//    while (!deque.isEmpty()) {
//      int size = deque.size();
//      for (int i = 0; i < size; i++) {
//        current = deque.pollLast();
//        if (list.size()>1){
//          Integer val = list.remove(0);
//
//          current.left = new TreeNode(val);
//          deque.add(current.left);
//        }
//        if (list.size()>1){
//          current.left = new TreeNode(list.remove(0));
//          deque.add(current.left);
//        }
//      }
//    }
//  }

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
