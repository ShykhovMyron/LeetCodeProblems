package daily

import util.TreeNode

fun main() {
    val node = TreeNode(4)
        .also {
            it.left = TreeNode(2)
            it.left.left = TreeNode(3)
            it.left.right = TreeNode(1)
        }
    addOneRow(node, 1, 3)
}

fun addOneRow(root: TreeNode?, `val`: Int, depth: Int): TreeNode? {
    if (root == null) return null
    if (depth == 1) return TreeNode(`val`).also { it.left = root }

    addRow(root, `val`, depth, 2)
    return root
}

fun addRow(root: TreeNode, `val`: Int, depth: Int, currDepth: Int) {
    if (currDepth == depth) {
        val left = TreeNode(`val`)
        val right = TreeNode(`val`)
        root.left?.let { left.left = root.left }
        root.right?.let { right.right = root.right }
        root.left = left
        root.right = right
    } else {
        root.left?.let { addRow(root.left, `val`, depth, currDepth + 1) }
        root.right?.let { addRow(root.right, `val`, depth, currDepth + 1) }
    }
}