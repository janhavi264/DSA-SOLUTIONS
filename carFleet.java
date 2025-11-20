import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // Step 1: Combine position and speed into a 2D array for sorting
        double[][] cars = new double[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        // Step 2: Sort cars by position in descending order (closest to target first)
        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

        // Step 3: Use stack to track fleets
        Stack<Double> stack = new Stack<>();

        // Step 4: Calculate each car’s time to reach the target
        for (int i = 0; i < n; i++) {remove k 
            double time = (target - cars[i][0]) / cars[i][1];

            // If this car’s time is greater than the top of stack, 
            // it cannot catch up — new fleet forms
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }
            // Else, it joins the fleet ahead (don’t push)
        }

        // Step 5: Number of fleets = number of elements in stack
        return stack.size();
    }
}
