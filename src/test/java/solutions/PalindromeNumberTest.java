package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/11/6
 *
 * @author Andy Ai
 */
public class PalindromeNumberTest extends TestCase {
    public void test() {
        PalindromeNumber solution = new PalindromeNumber();
        assertEquals(false, solution.isPalindrome(-2147483648));
        assertEquals(true, solution.isPalindrome(0));
        assertEquals(true, solution.isPalindrome(-0));
    }
}
