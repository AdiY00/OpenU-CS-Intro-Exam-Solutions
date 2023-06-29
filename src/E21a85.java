public class E21a85 {
    public static int minPrice(int[][] mat) {
        return minPrice(mat, 0, 0, 0);
    }

    private static int minPrice(int[][] mat, int start, int price, int i) {
        if (i == mat.length - 1) return price + mat[start][i];
        return Math.min(minPrice(mat, start, price, i + 1), minPrice(mat, i, price + mat[start][i], i + 1));
    }

    public static boolean findAverage(int[] arr, double x) {
        int left = 0, right = arr.length - 1;
        double sum = 0, average;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        while (left <= right) {
            average = sum / (right - left + 1);
            if (average == x) {
                System.out.println(left + " --- " + right);
                return true;
            }
            if (average > x) sum -= arr[right--];
            else sum -= arr[left++];
        }
        System.out.println("no sequence found.");
        return false;
    }

}
