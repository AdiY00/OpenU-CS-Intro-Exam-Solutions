public class E21b62 {
    public static boolean equalSplit(int[] arr) {
        int sum = sumArr(arr, 0);
        if (sum % 2 != 0 || arr.length % 2 != 0) return false;
        return equalSplit(arr, sum / 2, 0, 0);
    }

    private static boolean equalSplit(int[] arr, int target, int i, int amount) {
        if (target == 0 && amount == arr.length / 2) return true;
        if (i >= arr.length || amount > arr.length / 2) return false;
        return equalSplit(arr, target - arr[i], i + 1, amount + 1) || equalSplit(arr, target, i + 1, amount);
    }

    private static int sumArr(int[] arr, int i) {
        if (i >= arr.length) return 0;
        return arr[i] + sumArr(arr, ++i);
    }

    // I hate this solution tho
    public static boolean search(int[][] mat, int num) {
        int size = mat.length;
        int lowR = 0, highR = size - 1, leftC = 0, rightC = size - 1;
        int midR = (lowR + highR) / 2, midC = (leftC + rightC) / 2;
        boolean colsReversed = false, fullSquare = true;

        while (lowR <= highR && rightC >= 0 && leftC < size - 1) {
            if (fullSquare) {
                midR = (lowR + highR) / 2;
                midC = (leftC + rightC) / 2 + 1;
                if (mat[midR][midC] == num) {
                    System.out.println("row: " + midR + " column: " + midC);
                    return true;
                }
                if (mat[midR][midC] > num) {
                    colsReversed = false;
                    highR = midR;
                    midC = leftC;
                } else {
                    colsReversed = true;
                    lowR = midR + 1;
                    midR = highR;
                }
                fullSquare = false;
            } else {
                if (mat[midR][midC] == num) return true;
                if (colsReversed ^ (mat[midR][midC] > num))
                    rightC -= (highR - lowR) + 1;
                else leftC += (highR - lowR) + 1;
                fullSquare = true;
            }
        }
        return num == mat[size - 1][0];
    }
}
