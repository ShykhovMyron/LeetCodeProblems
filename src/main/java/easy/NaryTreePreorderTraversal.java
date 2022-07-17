package easy;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    public List<Integer> preorder(Node root) {
        List<Integer> values = new ArrayList<>();
        addValues(root, values);
        return values;
    }

    private void addValues(Node current, List<Integer> values) {
        if (current == null) return;
        values.add(current.val);
        for (Node child : current.children) {
            addValues(child, values);
        }
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
