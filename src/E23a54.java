public class E23a54 {

    public static int findAlmostSorted(int[] arr, int num) {
        int low = 0, high = arr.length - 2, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == num) return mid;
            if (arr[mid + 1] == num) return mid + 1;
            if (arr[mid] < num && num < arr[mid + 1]) {
                if (mid == 0 && mid == arr.length - 2) return -1;
                if (arr[mid + 2] == num) return mid + 2;
                if (arr[mid - 1] == num) return mid - 1;
                return -1;
            }
            if (num < Math.max(arr[mid], arr[mid + 1])) high = mid - 2;
            else if (num > Math.min(arr[mid], arr[mid + 1])) low = mid + 2;
            else return -1;
        }
        return -1;
    }

}
