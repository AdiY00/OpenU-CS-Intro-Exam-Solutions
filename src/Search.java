public class Search {
    public static boolean search(int[][] mat, int num) {
        int size = mat.length;
        int lowR = 0, highR = size - 1, leftC = 0, rightC = size - 1;
        int midR = (lowR + highR) / 2, midC = (leftC + rightC) / 2;
        boolean colsReversed = false, fullSquare = true;

        while (lowR <= highR && rightC >= 0 && leftC < size - 1) {
            if (fullSquare) {
                midR = (lowR + highR) / 2;
                midC = (leftC + rightC) / 2 + 1;
                if (mat[midR][midC] == num) return true;
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
