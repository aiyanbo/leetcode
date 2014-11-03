package solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * Component:
 * Description: https://oj.leetcode.com/problems/single-number/
 * Date: 14/11/3
 *
 * @author Andy Ai
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        Set<Integer> numbers = new HashSet<>();
        for (int number : A) {
            if (numbers.contains(number)) {
                numbers.remove(number);
            } else {
                numbers.add(number);
            }
        }
        return numbers.iterator().next();
    }
}
