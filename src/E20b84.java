import java.util.Arrays;

public class E20b84 {
    public static void findWord(char[][] arr, String word) {
        int[][] track = new int[arr.length][arr[0].length]; // makes a matrix full of zeros with the same size.
        findWord(arr, word, 0, 0, track);
    }

    private static void findWord(char[][] arr, String word, int row, int col, int[][] track) {
        if (row >= arr.length) System.out.println("No Such Word");
        else if (col >= arr[0].length) findWord(arr, word, row + 1, 0, track);
        else if (!isWord(arr, word, 0, row, col, track)) // try starting from here, and if it can't find:
            findWord(arr, word, row, col + 1, track); // go to next index
    }

    private static boolean isWord(char[][] arr, String word, int i, int row, int col, int[][] track) {
        if (row >= arr.length || col >= arr[0].length || row < 0 || col < 0) return false;
        if (arr[row][col] != word.charAt(i) || track[row][col] > 0) return false;
        track[row][col] = i + 1;
        if (i == word.length() - 1) {
            printArr(track);
            return true;
        }
        if (isWord(arr, word, i + 1, row - 1, col, track) || //up
            isWord(arr, word, i + 1, row + 1, col, track) || //down
            isWord(arr, word, i + 1, row, col - 1, track) || // left
            isWord(arr, word, i + 1, row, col + 1, track))   //right
            return true;
        track[row][col] = 0;
        return false;
    }

    private static void printArr(int[][] mat) {
        for (int[] row : mat) System.out.println(Arrays.toString(row));
    }
}
