public class E22b96 {
    public static int calc(int num, int result, int maxOp) {
        return calc(num, result, maxOp, num, "" + num);
    }

    private static int calc(int num, int result, int maxOp, int sum, String exp) {
        if (sum == result) {
            System.out.println(exp + " = " + result);
            return 1;
        }
        if (maxOp == 0) return 0;
        return calc(num, result, maxOp - 1, sum + num, exp + " + " + num) +
               calc(num, result, maxOp - 1, sum - num, exp + " - " + num) +
               calc(num, result, maxOp - 1, sum * num, exp + " * " + num) +
               calc(num, result, maxOp - 1, sum / num, exp + " / " + num);
    }

    public static int kAlmostSorted(int[] a, int num) {
        int low = 0, high = a.length - 1, mid;
        int dir = 1;
        while (low < high) {
            mid = (low + high) / 2;
            while (a[mid] == 0) {
                mid += dir;
                if (mid == high + 1) {
                    dir = -1;
                    mid = (low + high) / 2 - 1;
                }
                if (mid == low - 1) return -1;
            }
            dir = 1;
            if (a[mid] == num) return mid;
            if (a[mid] > num) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
