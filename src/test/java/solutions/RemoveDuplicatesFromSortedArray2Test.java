package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/11/4
 *
 * @author Andy Ai
 */
public class RemoveDuplicatesFromSortedArray2Test extends TestCase {
    public void test() {
        RemoveDuplicatesFromSortedArray2 solution = new RemoveDuplicatesFromSortedArray2();
        assertEquals(5, solution.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
        assertEquals(5, solution.removeDuplicates(new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3}));
    }
}
