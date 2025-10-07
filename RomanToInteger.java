class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int value = valueOf(s.charAt(i));

            if (i + 1 < n && value < valueOf(s.charAt(i + 1))) {
                total -= value;
            } else {
                total += value;
            }
        }

        return total;
    }

    private int valueOf(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0;
        }
    }
}

