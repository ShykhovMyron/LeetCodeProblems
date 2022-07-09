package easy;

/**
 * 20. Valid Parentheses
 * Easy
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        StringBuilder builder = new StringBuilder(s);
        while (!builder.isEmpty()) {
            int index = getParensIndex(builder);
            if (index == -1) return false;
            else removeParens(builder, index);
        }
        return true;
    }

    private void removeParens(StringBuilder builder, int index) {
        builder.delete(index, index + 2);
        index = index - 1;
        if (isSecondParenValid(index, builder)) {
            removeParens(builder, index);
        }
    }

    private int getParensIndex(StringBuilder builder) {
        int index;
        if ((index = builder.indexOf("()")) != -1) {
            return index;
        }
        if ((index = builder.indexOf("[]")) != -1) {
            return index;
        }
        if ((index = builder.indexOf("{}")) != -1) {
            return index;
        }
        return -1;
    }

    private boolean isSecondParenValid(int firstParenIndex, StringBuilder builder) {
        if (firstParenIndex < 0 || firstParenIndex >= builder.length() - 1) return false;
        char firstParen = builder.charAt(firstParenIndex);
        return switch (firstParen) {
            case '(' -> builder.charAt(firstParenIndex + 1) == ')';
            case '[' -> builder.charAt(firstParenIndex + 1) == ']';
            case '{' -> builder.charAt(firstParenIndex + 1) == '}';
            default -> false;
        };
    }
}
