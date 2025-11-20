class Solution {
    public String removeKdigits(String num, int k) {
        // Edge case
        if (num.length() == k) return "0";

        StringBuilder stack = new StringBuilder();

        for (char digit : num.toCharArray()) {
            // While the last digit in the stack is greater than current digit, remove it
            while (stack.length() > 0 && k > 0 && stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(digit);
        }

        // If still k > 0, remove from the end
        while (k > 0 && stack.length() > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }

        // Remove leading zeros
        int i = 0;
        while (i < stack.length() && stack.charAt(i) == '0') {
            i++;
        }

        // Get the final result
        String result = stack.substring(i);
        return result.isEmpty() ? "0" : result;
    }
}

