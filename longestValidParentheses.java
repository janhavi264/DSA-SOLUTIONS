import java.util.Stack;

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // base for first valid substring
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);  // reset base index
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.longestValidParentheses("(()"));      // Output: 2
        System.out.println(sol.longestValidParentheses(")()())"));   // Output: 4
        System.out.println(sol.longestValidParentheses(""));         // Output: 0
    }
}

