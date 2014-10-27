package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/10/27
 *
 * @author Andy Ai
 */
public class ValidNumberSolutionTest extends TestCase {
    public void test() {
        ValidNumberSolution solution = new ValidNumberSolution();
        assertEquals(true, solution.isNumber("0"));
        assertEquals(true, solution.isNumber(" 0.1"));
        assertEquals(false, solution.isNumber("abc"));
        assertEquals(false, solution.isNumber("1 a"));
        assertEquals(true, solution.isNumber("2e10"));
        assertEquals(false, solution.isNumber("959440.94f"));
        assertEquals(false, solution.isNumber("959440.94F"));
        assertEquals(false, solution.isNumber("84656e656D"));
        assertEquals(false, solution.isNumber("e9"));
    }
}
