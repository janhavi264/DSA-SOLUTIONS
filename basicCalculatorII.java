import java.util.Stack;

public class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char op = '+'; // start assuming the first operator is '+'
        s = s.trim() + "+"; // add '+' at end to process the last number

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0'); // build the number
            }

            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                if (op == '+') {
                    stack.push(num);
                } else if (op == '-') {
                    stack.push(-num);
                } else if (op == '*') {
                    stack.push(stack.pop() * num);
                } else if (op == '/') {
                    stack.push(stack.pop() / num);
                }

                op = c; // update operator
                num = 0; // reset number
            }
        }

        int result = 0;
        for (int n : stack) result += n;
        return result;
    }
}
 {
    
}
