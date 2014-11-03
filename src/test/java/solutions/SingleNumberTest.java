package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/11/3
 *
 * @author Andy Ai
 */
public class SingleNumberTest extends TestCase {
    public void test() {
        SingleNumber solution = new SingleNumber();
        assertEquals(1, solution.singleNumber(new int[]{0, 1, 0, 3, 4, 5, 8, 3, 5, 4, 8}));
    }
}
