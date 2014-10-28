package solutions;

/**
 * Component:
 * Description: https://oj.leetcode.com/problems/reverse-integer/
 * Date: 14/10/27
 *
 * @author Andy Ai
 */
public class ReverseInteger {
    public int reverse(int x) {
        String n = String.valueOf(Math.abs(x));
        int pow = n.length();
        int res = 0;
        for (int i = pow - 1; i > -1; i--) {
            res += Integer.valueOf(String.valueOf(n.charAt(i))) * Math.pow(10, i);
        }
        return x < 0 ? -1 * res : res;
    }
}
