public class E22b86 {
    public static int maxPath(int[][] mat) {
        return maxPath(mat, 0, 0, 0);
    }

    private static int maxPath(int[][] mat, int sum, int i, int j) {
        if (i >= mat.length || j >= mat[0].length) return Integer.MIN_VALUE;
        if (i == mat.length - 1 && j == mat[0].length - 1) return sum + mat[i][j];
        int num1 = mat[i][j] / 10, num2 = mat[i][j] % 10;
        return Math.max(maxPath(mat, sum + mat[i][j], i + num1, j + num2),
                        maxPath(mat, sum + mat[i][j], i + num2, j + num1));
    }

    public static void sortmod(int[] a, int k) {
        int newI = 0, temp;
        for (int i = 0; i < k; i++) {
            for (int j = newI; j < a.length; j++) {
                if (a[j] % k == i) {
                    temp = a[newI];
                    a[newI] = a[j];
                    a[j] = temp;
                    newI++;
                }
            }
        }
    }

}

