package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Component:
 * Description:
 * Date: 14/10/27
 *
 * @author Andy Ai
 */
public class ValidPalindromeSolution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return false;
        }
        String[] words = extractWords(s);
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
            int code = c.charAt(0);
            if (code >= 97 && code <= 122) {
                words.add(c);
            }
        }
        return words.toArray(new String[words.size()]);
    }
}