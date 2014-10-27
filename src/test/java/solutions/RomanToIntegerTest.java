package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/10/28
 *
 * @author Andy Ai
 */
public class RomanToIntegerTest extends TestCase {
    public void test() {
        RomanToInteger solution = new RomanToInteger();
        assertEquals(2014, solution.romanToInt("MMXIV"));
        assertEquals(621, solution.romanToInt("DCXXI"));
        assertEquals(1996, solution.romanToInt("MCMXCVI"));
    }
}
