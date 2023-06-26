public class E23a65 {
    public static int countPairs(int n) {
        return countPairs(n, 0, 0, "");
    }

    private static int countPairs(int n, int lefts, int rights, String exp) {
        if (lefts >= n && rights >= n) {
            System.out.println(exp);
            return 1;
        }
        if (lefts >= n) return countPairs(n, lefts, rights + 1, exp + ")");
        if (lefts == rights) return countPairs(n, lefts + 1, rights, exp + "(");
        return countPairs(n, lefts + 1, rights, exp + "(") + countPairs(n, lefts, rights + 1, exp + ")");
    }

    public static boolean superInc(int[] arr, int k) {
        int i = arr.length - 1;
        while (i >= 0) {
            if (k / 2 > arr[i]) return false;
            if (k >= arr[i]) k -= arr[i];
            if (k == 0) return true;
            i--;
        }
        return false;
    }
}
