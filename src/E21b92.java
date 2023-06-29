public class E21b92 {
    public static int printExpr(int[] arr, int num) {
        return printExpr(arr, num, 0, "");
    }

    private static int printExpr(int[] arr, int num, int i, String expr) {
        if (num == 0) {
            System.out.println(expr);
            return 1;
        }
        if (i >= arr.length) return 0;
        return printExpr(arr, num - arr[i], i + 1, expr + "+" + arr[i] + " ") +
               printExpr(arr, num + arr[i], i + 1, expr + "-" + arr[i] + " ") +
               printExpr(arr, num, i + 1, expr);
    }


    public static int longestSequence(int[] a, int k) {
        int left = 0, longest = 0, zeros = 0;
        for (int right = 0; right < a.length; right++) {
            if (a[right] == 0) zeros++;
            while (zeros > k) {
                if (a[left] == 0) zeros--;
                left++;
            }
            if (right - left + 1 > longest) longest++;
        }
        return longest;
    }
}
