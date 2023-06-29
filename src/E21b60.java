public class E21b60 {
    public static boolean split3(int[] arr) {
        int sum = sumArr(arr, 0);
        if (sum % 3 != 0) return false;
        return split3(arr, 0, 0, 0, sum / 3, 0);
    }

    private static boolean split3(int[] arr, int sum1, int sum2, int i, int target, int amount1and2) {
        if (sum1 == target && sum2 == target) return true;
        if (i >= arr.length || amount1and2 >= arr.length - 1) return false;
        return split3(arr, sum1 + arr[i], sum2, i + 1, target, amount1and2 + 1) ||
                split3(arr, sum1, sum2 + arr[i], i + 1, target, amount1and2 + 1) ||
                split3(arr, sum1, sum2, i + 1, target, amount1and2);
    }

    private static int sumArr(int[] arr, int i) {
        if (i >= arr.length) return 0;
        return arr[i] + sumArr(arr, ++i);
    }


    public static int smallestSub(int[] a, int k) {
        int left = 0, right = 0, currentSum = 0, minLength = a.length + 1;
        while (right < a.length) {
            currentSum += a[right];
            while (currentSum > k) {
                if (right - left + 1 < minLength) minLength--;
                currentSum -= a[left++];
            }
            right++;
        }
        return minLength;
    }
}
