import java.util.*;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<String> str = new Stack<>();
        String curr = "";
        int k = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                k = k * 10 + (c - '0');
            } else if (c == '[') {
                count.push(k);
                str.push(curr);
                k = 0;
                curr = "";
            } else if (c == ']') {
                int times = count.pop();
                StringBuilder temp = new StringBuilder(str.pop());
                while (times-- > 0) temp.append(curr);
                curr = temp.toString();
            } else {
                curr += c;
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.decodeString("3[a]2[bc]"));      // aaabcbc
        System.out.println(sol.decodeString("3[a2[c]]"));       // accaccacc
        System.out.println(sol.decodeString("2[abc]3[cd]ef"));  // abcabccdcdcdef
    }
}

