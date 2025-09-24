public class solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // number of flowers we can place
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            // Check if current plot is empty
            if (flowerbed[i] == 0) {
                // Check left and right plots
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);

                // If both sides are empty, we can plant here
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // plant flower
                    count++; // increase count
                    if (count >= n) {
                        return true; // early return if we've planted enough
                    }
                }
            }
        }

        return count >= n;
    }
}
