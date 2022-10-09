package daily

import util.TreeNode

fun main() {
    findTarget(
        TreeNode(2).also { it.left = TreeNode(1) }.also { it.right = TreeNode(3) },
        3
    )
}

fun findTarget(root: TreeNode?, k: Int): Boolean {
    if (root == null) return false
    val deque = ArrayDeque<TreeNode>()
    deque.add(root)

    val values = mutableSetOf<Int>()
    while (deque.isNotEmpty()) {
        repeat(deque.size) {
            val current = deque.removeFirst()
            if (values.isContainsSum(current.`val`, k)) return true
            current.left?.also { deque.addLast(it) }
            current.right?.also { deque.addLast(it) }
        }
    }

    return false
}

fun MutableSet<Int>.isContainsSum(`val`: Int, k: Int): Boolean {
    val result: Boolean
    if (isEmpty()) result = false
    else {
        result = contains(k - `val`)
        add(`val`)
    }
    add(`val`)
    return result
}