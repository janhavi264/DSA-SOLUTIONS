import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices of days

        // Traverse from last day to first day
        for (int i = n - 1; i >= 0; i--) {
            int currentTemp = temperatures[i];

            // Pop all days that are not warmer than current day
            while (!stack.isEmpty() && temperatures[stack.peek()] <= currentTemp) {
                stack.pop();
            }

            // If stack is not empty, top element is the next warmer day
            if (!stack.isEmpty()) {
                answer[i] = stack.peek() - i;
            } else {
                answer[i] = 0; // no warmer day ahead
            }

            // Push current day index into stack
            stack.push(i);
        }

        return answer;
    }
}

