package daily._2022_9;

import util.TreeNode;

public class ConstructStringBinaryTree {
    public String tree2str(TreeNode root) {
        if (root == null) return "";
        StringBuilder rootS = new StringBuilder(String.valueOf(root.val));
        String left = tree2str(root.left);
        String right = tree2str(root.right);
        if (!left.isEmpty() && !right.isEmpty()) {
            rootS.append("(").append(left).append(")").append("(").append(right).append(")");
        } else if (left.isEmpty() && !right.isEmpty()) {
            rootS.append("()").append("(").append(right).append(")");
        } else if (!left.isEmpty()) {
            rootS.append("(").append(left).append(")");
        }

        return rootS.toString();
    }
}
