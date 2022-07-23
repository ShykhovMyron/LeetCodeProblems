package easy;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

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
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(5);
        root.left = new ValidateBinarySearchTree.TreeNode(4);
        root.right = new ValidateBinarySearchTree.TreeNode(6);
        root.right.left = new ValidateBinarySearchTree.TreeNode(3);
        root.right.right = new ValidateBinarySearchTree.TreeNode(7);
        boolean actual = validateBinarySearchTree.isValidBST(root);

        Assertions.assertFalse(actual);
    }

    @Test
    void isValidBSTSimple() {
        ValidateBinarySearchTree.TreeNode root = new ValidateBinarySearchTree.TreeNode(2);
        root.left = new ValidateBinarySearchTree.TreeNode(1);
        root.right = new ValidateBinarySearchTree.TreeNode(3);
        boolean actual = validateBinarySearchTree.isValidBST(root);

        Assertions.assertTrue(actual);
    }
}