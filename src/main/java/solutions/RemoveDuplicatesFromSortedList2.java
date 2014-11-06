package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Component:
 * Description: https://oj.leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * Date: 14/11/6
 *
 * @author Andy Ai
 */
public class RemoveDuplicatesFromSortedList2 {
    public ListNode deleteDuplicates(ListNode head) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> removed = new ArrayList<>();
        ListNode iter = head;
        while (iter != null) {
            int val = iter.val;
            if (numbers.contains(val)) {
                numbers.remove(Integer.valueOf(val));
                removed.add(val);
            } else {
                if (!removed.contains(val)) {
                    numbers.add(val);
                }
            }
            iter = iter.next;
        }
        return apply(numbers);
    }

    private ListNode apply(List<Integer> numbers) {
        if (numbers.size() == 0) {
            return null;
        }
        ListNode res = null;
        ListNode prev = null;
        for (int i = 0; i < numbers.size(); i++) {
            if (i == 0) {
                res = new ListNode(numbers.get(0));
                prev = res;
            } else {
                ListNode node = new ListNode(numbers.get(i));
                prev.next = node;
                prev = node;
            }
        }
        return res;
    }
}
