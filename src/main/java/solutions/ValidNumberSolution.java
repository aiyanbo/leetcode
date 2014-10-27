package solutions;

/**
 * Component:
 * Description:
 * https://oj.leetcode.com/problems/valid-number/
 * <p>
 * Date: 14/10/27
 *
 * @author Andy Ai
 */
public class ValidNumberSolution {
    public boolean isNumber(String s) {
        String target = s.trim();
        return target.length() != 0 && (
                target.matches("(-|\\+)?\\d+")
                        || target.matches("(-|\\+)?\\d+\\.\\d*")
                        || target.matches("(-|\\+)?\\d*\\.\\d+")
                        || target.matches("(-|\\+)?\\d+e(-|\\+)?\\d+")
                        || target.matches("(-|\\+)?\\d+\\.\\d*e?\\d+")
                        || target.matches("(-|\\+)?\\.\\d+e(-|\\+)?\\d+")
                        || target.matches("(-|\\+)?\\d+e\\+\\d+")
                        || target.matches("\\d+\\.e(-|\\+)?\\d+")
                        || target.matches("(-|\\+)?\\d+\\.\\d+e(-|\\+)?\\d+")
        );
    }
}
