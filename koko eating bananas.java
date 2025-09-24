class Solution {
    public int minEatingSpeed(int[] piles, int h) {      //CHECKS THE RANGE OF BINARY SEARCH HENCE THIS FOR  LOOP FIND THE MAX ELEMENT IN THE PILES ARRAY
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > end) {
                end = piles[i];
            }
        }

        int ans = end; // ✅ Declare ans here

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isEatingSpeedValid(piles, mid, h)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    boolean isEatingSpeedValid(int[] piles, int eatingSpeed, int hours) {
        int hoursSpent = 0;
        for (int i = 0; i < piles.length; i++) {
            hoursSpent += piles[i] / eatingSpeed;
            if (piles[i] % eatingSpeed != 0) {
                hoursSpent += 1;
            }
            if (hoursSpent > hours) return false;
        }
        return true;
    }
}