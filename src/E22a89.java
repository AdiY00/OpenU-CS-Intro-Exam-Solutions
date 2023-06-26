public class E22a89 {
    public static boolean isJump(String str1, String str2, int step) {
        if (str2.length() * step > str1.length() + 1) return false;
        return isJump(str1, str2, step, 0);
    }

    private static boolean isJump(String str1, String str2, int step, int i) {
        if (i >= str2.length()) return true;
        if (str2.charAt(i) != str1.charAt(i * step)) return false;
        return isJump(str1, str2, step, ++i);
    }

    public static int strStep(String str1, String str2) {
        int maxJump = str1.length() / str2.length();
        if (maxJump < 1) return -1;
        return strStep(str1, str2, maxJump, 1);
    }

    private static int strStep(String str1, String str2, int maxStep, int currentStep) {
        if (currentStep > maxStep) return -1;
        if (isJump(str1, str2, currentStep)) return currentStep;
        return strStep(str1, str2, maxStep, ++currentStep);
    }


    public static int longestSubarray(int[] a) {
        if (a.length == 0) return 0;
        int longest = 1;
        int left = 0, right = 1;
        int startingIndex = 0, endingIndex = 0;
        while (right < a.length) {
            if (a[right - 1] < 0 ? a[right] < 0 : a[right] > 0) left = right;
            else if (right - left + 1 > longest) {
                longest++;
                startingIndex = left;
                endingIndex = right;
            }
            right++;
        }
        System.out.println("Starting index = " + startingIndex + " Ending index = " + endingIndex);
        return longest;
    }

}
