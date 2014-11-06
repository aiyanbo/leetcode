package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/11/6
 *
 * @author Andy Ai
 */
public class RemoveDuplicatesFromSortedList2Test extends TestCase {
    public void test() {
        RemoveDuplicatesFromSortedList2 solution = new RemoveDuplicatesFromSortedList2();
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        assertEquals(2, solution.deleteDuplicates(head).val);
    }
}
