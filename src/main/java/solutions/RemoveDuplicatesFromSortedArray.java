package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Component:
 * Description: https://oj.leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Date: 14/11/4
 *
 * @author Andy Ai
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        List<Integer> res = new ArrayList<>(A.length);
        int prev = A[0] - 1;
        for (int number : A) {
            if (number != prev) {
                res.add(number);
            }
            prev = number;
        }
        for (int i = 0; i < res.size(); i++) {
            A[i] = res.get(i);
        }
        return res.size();
    }
}
