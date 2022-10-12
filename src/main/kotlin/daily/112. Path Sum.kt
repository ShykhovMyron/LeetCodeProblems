package daily

import util.TreeNode

fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if (root == null) return false

    return if (root.left == null && root.right == null && root.`val` == targetSum) true
    else {
        hasPathSum(root.left, targetSum - root.`val`) ||
                hasPathSum(root.right, targetSum - root.`val`)
    }
}