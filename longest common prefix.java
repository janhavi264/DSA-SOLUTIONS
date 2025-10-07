import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Edge case: if array is null or empty
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Step 1: Sort the array
        Arrays.sort(strs);

        // Step 2: Take the first and last strings
        String first = strs[0];
        String last = strs[strs.length - 1];

        // Step 3: Compare characters of first and last
        int minLen = Math.min(first.length(), last.length());
        int i;
        for (i = 0; i < minLen; i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break; // stop when characters differ
            }
        }

        // Step 4: The prefix is the substring from 0 to i
        return first.substring(0, i);
    }
}
