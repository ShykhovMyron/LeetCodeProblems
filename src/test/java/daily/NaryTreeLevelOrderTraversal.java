package daily;

import util.Node;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Deque<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> crntLevel = new ArrayList<>();
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                Node current = queue.poll();
                queue.addAll(current.children);
                crntLevel.add(current.val);
            }
            result.add(crntLevel);
        }

        return result;
    }
}
