public class Solution {
    public int trap(int[] h) {
        if (h == null || h.length < 3) return 0;
        int l = 0, r = h.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;
        while (l <= r) {
            if (h[l] <= h[r]) {
                if (h[l] >= leftMax) leftMax = h[l];
                else water += leftMax - h[l];
                l++;
            } else {
                if (h[r] >= rightMax) rightMax = h[r];
                else water += rightMax - h[r];
                r--;
            }
        }
        return water;
    }
}

