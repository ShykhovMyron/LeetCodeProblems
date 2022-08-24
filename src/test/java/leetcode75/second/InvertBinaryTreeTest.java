package leetcode75.second;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import util.TreeNode;

import java.util.stream.Stream;

import static util.TreeNode.arrayToTree;

class InvertBinaryTreeTest {

  private final InvertBinaryTree invertBinaryTree = new InvertBinaryTree();

  static Stream<Arguments> generateData() {
    return Stream.of(
        Arguments.of(
            arrayToTree(new int[] {4, 2, 7, 1, 3, 6, 9}),
            arrayToTree(new int[] {4, 7, 2, 9, 6, 3, 1})));
  }

  @ParameterizedTest
  @MethodSource("generateData")
  void invertTreeTest(TreeNode root, TreeNode expected) {
    TreeNode actual = invertBinaryTree.invertTree(root);
    Assertions.assertThat(actual).isEqualTo(expected);
  }
}
