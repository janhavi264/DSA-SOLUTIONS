import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) continue; // ignore empty or current dir
            else if (part.equals("..")) { // go one dir up
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(part); // valid directory name
            }
        }

        return "/" + String.join("/", stack);
    }
}

