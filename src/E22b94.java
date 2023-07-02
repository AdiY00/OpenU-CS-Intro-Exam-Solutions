public class E22b94 {
    public static int lengthPath(char[][] mat, String pattern) {
        return lengthPath(mat, pattern, 0, 0);
    }

    private static int lengthPath(char[][] mat, String pattern, int row, int col) {
        if (row < 0 || col < 0 || row >= mat.length || col >= mat[0].length || pattern.indexOf(mat[row][col]) == -1)
            return 0;
        char temp = mat[row][col];
        mat[row][col] = 0;
        int up = lengthPath(mat, pattern, row - 1, col);
        int down = lengthPath(mat, pattern, row + 1, col);
        int left = lengthPath(mat, pattern, row, col - 1);
        int right = lengthPath(mat, pattern, row, col + 1);
        mat[row][col] = temp;
        return 1 + Math.max(Math.max(up, down), Math.max(left, right)); // 1 + max of up, down, left, right
    }

    public static int maxPath(char[][] mat, String pattern) {
        return maxPath(mat, pattern, 0, 0);
    }

    private static int maxPath(char[][] mat, String pattern, int row, int col) {
        if (row >= mat.length) return 0;
        if (col >= mat[0].length) return maxPath(mat, pattern, row + 1, 0);
        return Math.max(lengthPath(mat, pattern, row, col), maxPath(mat, pattern, row, col + 1));
    }

    public static int findDuplicate(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int j = Math.abs(a[i]);
            if (a[j] < 0) return j;
            a[j] *= -1;
        }
        return -1;
    }

//    public static int findDuplicateV2(int[] a) {
//        int i = 0, temp;
//        while (i < a.length) {
//            if (a[i] == 0) return i;
//            temp = i;
//            i = a[i];
//            a[temp] = 0;
//        }
//        return -1;
//    }
}
