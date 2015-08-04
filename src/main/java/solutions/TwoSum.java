package solutions;

/**
 * Component:
 * Description:
 * Date: 15/5/15
 *
 * @author Andy Ai
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (nums[i] + nums[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        throw new IllegalArgumentException("Bad argument: nums");
    }
}
