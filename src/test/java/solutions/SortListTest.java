package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/11/5
 *
 * @author Andy Ai
 */
public class SortListTest extends TestCase {
    public void test() {
        SortList solution = new SortList();
        ListNode head = new ListNode(10);
        head.next = new ListNode(34);
        head.next.next = new ListNode(5);
        assertEquals(5, solution.sortList(head).val);
    }
}
