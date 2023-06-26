public class E22a67 {

    public static boolean isIdentity(int[][] mat, int x, int size) {
        if (size == 0) return true;
        if (mat[x][x] != 1) return false;
        if (!allZeros(mat, x, size)) return false;
        return isIdentity(mat, ++x, --size);
    }

    private static boolean allZeros(int[][] mat, int x, int size) {
        if (size <= 1) return true;
        if (mat[x + size - 1][x] != 0 || mat[x][x + size - 1] != 0) return false;
        return allZeros(mat, x, --size);
    }

    public static int maxMatrix(int[][] mat) {
        return maxMatrix(mat, 0, mat.length);
    }

    private static int maxMatrix(int[][] mat, int x, int size) {
        if (size <= 0) return 0;
        if (isIdentity(mat, x, size)) return size;
        return maxMatrix(mat, ++x, size - 2);
    }
}
