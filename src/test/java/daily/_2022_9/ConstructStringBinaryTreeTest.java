package daily._2022_9;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import util.TreeNode;

class ConstructStringBinaryTreeTest {

    final ConstructStringBinaryTree constructStringBinaryTree = new ConstructStringBinaryTree();

    @ParameterizedTest
    @CsvSource({
            "1(2()(4))(3)",
    })
    void tree2strTest(String expected) {
        String actual = constructStringBinaryTree.tree2str(create());
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    TreeNode create() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);

        return root;
    }
}