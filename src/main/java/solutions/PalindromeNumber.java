package solutions;

/**
 * Component:
 * Description:
 * Date: 14/11/6
 *
 * @author Andy Ai
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String[] numbers = String.valueOf(Math.abs(x)).split("|");
        for (int i = 0; i < numbers.length / 2; i++) {
            if (!numbers[i].equals(numbers[numbers.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }
}
