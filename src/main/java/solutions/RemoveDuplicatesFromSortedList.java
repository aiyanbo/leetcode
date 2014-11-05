package solutions;

/**
 * Component:
 * Description: https://oj.leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Date: 14/11/5
 *
 * @author Andy Ai
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode res = new ListNode(head.val);
        ListNode iter = head;
        ListNode curr = res;
        while (iter.next != null) {
            ListNode next = iter.next;
            if (iter.val != next.val) {
                curr.next = new ListNode(next.val);
                curr = curr.next;
            }
            iter = next;
        }
        return res;
    }
}
