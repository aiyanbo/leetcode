package solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Component:
 * Description: https://oj.leetcode.com/problems/roman-to-integer/
 * Date: 14/10/28
 *
 * @author Andy Ai
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String, Integer> romanMapper = new HashMap<>(7);
        romanMapper.put("I", 1);
        romanMapper.put("V", 5);
        romanMapper.put("X", 10);
        romanMapper.put("L", 50);
        romanMapper.put("C", 100);
        romanMapper.put("D", 500);
        romanMapper.put("M", 1000);
        int[] numbers = new int[s.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = romanMapper.get(String.valueOf(s.charAt(i)));
        }
        int res = 0;
        for (int i = 0; i < numbers.length; ) {
            if (i + 2 < numbers.length) {
                int a = numbers[i];
                int b = numbers[i + 1];
                int c = numbers[i + 2];
                if (a < b) {
                    res += b - a;
                    i += 2;
                } else if (a >= b && b >= c) {
                    res += a + b;
                    i += 2;
                } else if (a >= b && b < c) {
                    res += a;
                    i++;
                }
            } else if (i + 1 < numbers.length) {
                int a = numbers[i];
                int b = numbers[i + 1];
                if (a >= b) {
                    res += a + b;
                } else {
                    res += b - a;
                }
                i += 2;
            } else {
                res += numbers[i];
                i++;
            }
        }
        return res;
    }

}
