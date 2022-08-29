package easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import util.TreeNode;

import java.util.stream.Stream;

class ValidateBinarySearchTreeTest {

    private final ValidateBinarySearchTree validateBinarySearchTree = new ValidateBinarySearchTree();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 4, 1, 8, 5, 2, 2, 1, 4, 1}, 1),
                Arguments.of(new int[]{1}, 1)
        );
    }

    @Test
    void isValidBST() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(4);
    root.right = new TreeNode(6);
    root.right.left = new TreeNode(3);
    root.right.right = new TreeNode(7);
        boolean actual = validateBinarySearchTree.isValidBST(root);

        Assertions.assertFalse(actual);
    }

    @Test
    void isValidBSTSimple() {
    TreeNode root = new TreeNode(2);
    root.left = new TreeNode(1);
    root.right = new TreeNode(3);
        boolean actual = validateBinarySearchTree.isValidBST(root);

        Assertions.assertTrue(actual);
    }
}