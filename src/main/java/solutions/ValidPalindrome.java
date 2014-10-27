package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Component:
 * Description:
 * https://oj.leetcode.com/problems/valid-palindrome/
 * <p>
 * Date: 14/10/27
 *
 * @author Andy Ai
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String target = s.trim();
        if (target.isEmpty()) {
            return true;
        }
        String[] words = extractWords(target);
        for (int i = 0; i < words.length / 2; i++) {
            if (!words[i].equals(words[words.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }

    private String[] extractWords(String s) {
        String[] chars = s.toLowerCase().split("|");
        List<String> words = new ArrayList<>(chars.length);
        for (String c : chars) {
            if (Character.isLetterOrDigit(c.charAt(0))) {
                words.add(c);
            }
        }
        return words.toArray(new String[words.size()]);
    }
}
