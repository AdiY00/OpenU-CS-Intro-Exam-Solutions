public class E23a72 {
    public static int friends3(int[][] mat) {
        return friends3(mat, 0, 1, 0);
    }

    private static int friends3(int[][] mat, int f1, int f2, int circles) {
        if (f1 == mat.length - 1) return circles;
        if (f2 == mat.length) return friends3(mat, f1 + 1, f1 + 2, circles);
        if (mat[f1][f2] == 1) circles += commonFriends(mat, f1, f2, f2 + 1, 0);
        return friends3(mat, f1, f2 + 1, circles);
    }

    private static int commonFriends(int[][] mat, int f1, int f2, int i, int circles) {
        if (i == mat.length) return circles;
        if (mat[f1][i] == 1 && mat[f2][i] == 1) {
            System.out.println(f1 + " " + f2 + " " + i);
            return commonFriends(mat, f1, f2, ++i, ++circles);
        } else return commonFriends(mat, f1, f2, ++i, circles);
    }
}
