package solutions;

import junit.framework.TestCase;

/**
 * Component:
 * Description:
 * Date: 14/11/5
 *
 * @author Andy Ai
 */
public class RemoveDuplicatesFromSortedListTest extends TestCase {
    public void test() {
        RemoveDuplicatesFromSortedList solution = new RemoveDuplicatesFromSortedList();
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(1);
        ListNode res1 = solution.deleteDuplicates(head1);
        assertEquals(1, res1.val);
        assertEquals(null, res1.next);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(1);
        head2.next.next = new ListNode(2);
        ListNode res2 = solution.deleteDuplicates(head2);
        assertEquals(1, res2.val);
        assertEquals(2, res2.next.val);
    }
}
