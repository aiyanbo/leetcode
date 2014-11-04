package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/11/4
 *
 * @author Andy Ai
 */
public class RemoveDuplicatesFromSortedArrayTest extends TestCase {
    public void test() {
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        assertEquals(3, solution.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
        assertEquals(3, solution.removeDuplicates(new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3}));
    }
}
