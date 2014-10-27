package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/10/27
 *
 * @author Andy Ai
 */
public class ValidPalindromeSolutionTest extends TestCase {
    public void test() {
        ValidPalindromeSolution solution = new ValidPalindromeSolution();
        assertEquals(true, solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, solution.isPalindrome("race a car"));
        assertEquals(false, solution.isPalindrome("1a2"));
        assertEquals(true, solution.isPalindrome(""));
        assertEquals(true, solution.isPalindrome(" "));
    }
}
