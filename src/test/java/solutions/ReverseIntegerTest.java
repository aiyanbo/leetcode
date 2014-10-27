package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/10/27
 *
 * @author Andy Ai
 */
public class ReverseIntegerTest extends TestCase {
    public void test() {
        ReverseInteger solution = new ReverseInteger();
        assertEquals(-321, solution.reverse(-123));
        assertEquals(321, solution.reverse(123));
    }
}
