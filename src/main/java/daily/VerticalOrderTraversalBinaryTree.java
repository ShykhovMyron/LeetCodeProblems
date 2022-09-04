package daily;

import util.Pair;
import util.TreeNode;

import java.util.*;

public class VerticalOrderTraversalBinaryTree {
    Map<Integer, List<Integer>> columnNums = new TreeMap<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Deque<Pair<Integer, TreeNode>> pairs = new ArrayDeque<>();
        pairs.add(new Pair<>(0, root));

        while (!pairs.isEmpty()) {
            Map<Integer, List<Integer>> temp = new HashMap<>();
            int size = pairs.size();
            for (int i = 0; i < size; i++) {
                Pair<Integer, TreeNode> pair = pairs.pollFirst();
                TreeNode node = pair.val();
                if (node.left != null) pairs.addLast(new Pair<>(pair.key() - 1, node.left));
                if (node.right != null) pairs.addLast(new Pair<>(pair.key() + 1, node.right));
                addToMap(temp, pair.key(), node.val);
            }

            for (Map.Entry<Integer, List<Integer>> entry : temp.entrySet()) {
                columnNums.putIfAbsent(entry.getKey(), new ArrayList<>());
                Collections.sort(entry.getValue());
                columnNums.get(entry.getKey()).addAll(entry.getValue());
            }
        }
        return columnNums.values().stream().toList();
    }

    private void addToMap(Map<Integer, List<Integer>> map, int x, int val) {
        map.putIfAbsent(x, new ArrayList<>());
        map.get(x).add(val);
    }
}
