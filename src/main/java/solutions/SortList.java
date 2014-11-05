package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Component:
 * Description: https://oj.leetcode.com/problems/sort-list/
 * Date: 14/11/5
 *
 * @author Andy Ai
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        List<Integer> numbers = flatPattern(head);
        Collections.sort(numbers);
        return apply(numbers);
    }

    private ListNode apply(List<Integer> numbers) {
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

    public List<Integer> flatPattern(ListNode list) {
        List<Integer> numbers = new ArrayList<>();
        ListNode curr = list;
        while (curr != null) {
            numbers.add(curr.val);
            curr = curr.next;
        }
        return numbers;
    }
}
