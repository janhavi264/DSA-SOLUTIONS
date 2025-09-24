public class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;           // update first if num is smaller than first
            } else if (num <= second) {
                second = num;          // update second if num is between first and second
            } else {
                // found a num greater than both first and second
                return true;
            }
        }
        return false;
    }
}
