public class E22b91 {
    public static int cheapRt(int[] stations, int step1, int step2, int limit) {
        return cheapRt(stations, step1, step2, limit, 0, stations[0], "");
    }

    private static int cheapRt(int[] stations, int step1, int step2, int limit, int i, int sum, String exp) {
        if (i >= stations.length) return Integer.MAX_VALUE;
        if (i == stations.length - 1) {
            System.out.println(exp + " " + stations[i] + " =" + sum);
            return sum;
        }
        return Math.min(
                cheapRt(stations, step1, step2, limit, i + step1, sum + stations[i], exp + " " + i),
                limit > 0 ?
                        cheapRt(stations, step1, step2, limit - 1, i + step2, sum + stations[i], exp + " " + i)
                        : Integer.MAX_VALUE
        );
    }

    public static int findTriplet(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] >= max2) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] >= max3) max3 = arr[i];

            if (arr[i] <= min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] <= min2) min2 = arr[i];
        }
        if (max1 * max2 * max3 > max1 * min1 * min2)
            System.out.println(max1 + " " + max2 + " " + max3);
        else System.out.println(max1 + " " + min1 + " " + min2);
        return Math.max(max1 * max2 * max3, max1 * min1 * min2);

    }
}
