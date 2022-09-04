package daily;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import util.TreeNode;

import java.util.List;
import java.util.stream.Stream;

class VerticalOrderTraversalBinaryTreeTest {

    final VerticalOrderTraversalBinaryTree verticalOrderTraversalBinaryTree = new VerticalOrderTraversalBinaryTree();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(TreeNode.arrayToTree(new int[]{1, 2, 3, 4, 6, 5, 7}), List.of(List.of(4), List.of(2), List.of(1, 5, 6), List.of(3), List.of(7)))
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void verticalTraversal(TreeNode root, List<List<Integer>> expected) {
        List<List<Integer>> actual = verticalOrderTraversalBinaryTree.verticalTraversal(root);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}