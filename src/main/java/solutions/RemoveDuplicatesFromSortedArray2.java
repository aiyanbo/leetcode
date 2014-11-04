package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Component:
 * Description: https://oj.leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * Date: 14/11/4
 *
 * @author Andy Ai
 */
public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        List<Integer> res = new ArrayList<>(A.length);
        int duplicates = 0;
        int prev = A[0] - 1;
        int count = 0;
        for (int number : A) {
            if (number != prev) {
                count++;
                duplicates = 0;
                res.add(number);
            } else {
                duplicates++;
                if (duplicates < 2) {
                    res.add(number);
                    count++;
                }
            }
            prev = number;
        }
        for (int i = 0; i < res.size(); i++) {
            A[i] = res.get(i);
        }
        return count;
    }
}
