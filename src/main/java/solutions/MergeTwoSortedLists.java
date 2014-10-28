package solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Component:
 * Description: https://oj.leetcode.com/problems/merge-two-sorted-lists/
 * Date: 14/10/28
 *
 * @author Andy Ai
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(flatPattern(l1));
        numbers.addAll(flatPattern(l2));
        Collections.sort(numbers);
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

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }
}
