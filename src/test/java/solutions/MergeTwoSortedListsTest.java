package solutions;

import junit.framework.TestCase;

import java.util.List;

/**
 * Component:
 * Description:
 * Date: 14/10/28
 *
 * @author Andy Ai
 */
public class MergeTwoSortedListsTest extends TestCase {
    public void test() {
        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        ListNode res = solution.mergeTwoLists(new ListNode(2), new ListNode(1));
        List<Integer> resNumbers = solution.flatPattern(res);
        assertEquals(1, resNumbers.get(0).intValue());
        assertEquals(2, resNumbers.get(1).intValue());
    }
}
