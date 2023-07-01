public class E20b96 {
    public static int maxSumKnight(int[][] mat) {
        return maxSumKnight(mat, 0, 0, mat[0][0]);
    }

    private static int maxSumKnight(int[][] mat, int row, int col, int lastValue) {
        if (row >= mat.length || col >= mat[0].length || row < 0 || col < 0) return -1;
        int currentValue = mat[row][col];
        if (Math.abs(currentValue - lastValue) > 1) return -1;
        if (row == mat.length - 1 && col == mat[0].length - 1) return currentValue;
        mat[row][col] = -1;
        int ur = maxSumKnight(mat, row - 2, col + 1, currentValue);
        int ul = maxSumKnight(mat, row - 2, col - 1, currentValue);
        int dr = maxSumKnight(mat, row + 2, col + 1, currentValue);
        int dl = maxSumKnight(mat, row + 2, col - 1, currentValue);
        int ru = maxSumKnight(mat, row - 1, col + 2, currentValue);
        int rd = maxSumKnight(mat, row + 1, col + 2, currentValue);
        int lu = maxSumKnight(mat, row - 1, col - 2, currentValue);
        int ld = maxSumKnight(mat, row + 1, col - 2, currentValue);
        int maxSum = Math.max(Math.max(Math.max(ur, ul), Math.max(dr, dl)), Math.max(Math.max(ru, rd), Math.max(lu, ld)));
        mat[row][col] = currentValue;
        return maxSum == -1 ? -1 : currentValue + maxSum;
    }


    public static int minimalPositive(Range[] rangeA) {
        int low = 0, high = rangeA.length - 1, mid;
        // getting the first range where the _big is greater than 0.
        while (low < high) {
            mid = (low + high) / 2;
            if (rangeA[mid].getBig() > 0) high = mid;
            else low = mid + 1;
        }
        // if we did not find any, return -1.
        if (rangeA[low].getBig() < 1) return -1;
        // if the smallest number in the range is bigger than 1, return it, otherwise return 1.
        return Math.max(rangeA[low].getSmall(), 1);
    }
}

