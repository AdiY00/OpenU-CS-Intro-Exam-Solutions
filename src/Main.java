import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {
                new int[]{1, 2, 3, 2, 0, 1, 2},
                new int[]{0, 1, 0, 0, 0, 0, 0},
                new int[]{0, 0, 1, 0, 0, 0, 0},
                new int[]{5, 0, 0, 1, 0, 0, 0},
                new int[]{7, 0, 0, 0, 1, 0, 0},
                new int[]{8, 0, 0, 0, 0, 1, 0},
                new int[]{1, 0, 0, 0, 0, 0, 0}
        };
//        System.out.println(E22a67.isIdentity(mat, 0, 1));
//        System.out.println(E22a67.isIdentity(mat, 1, 1));
//        System.out.println(E22a67.isIdentity(mat, 1, 2));
//        System.out.println(E22a67.isIdentity(mat, 1, 3));
//        System.out.println(E22a67.isIdentity(mat, 1, 4));
//        System.out.println(E22a67.isIdentity(mat, 4, 1));
//        System.out.println(E22a67.isIdentity(mat, 4, 2));
//        System.out.println(E22a67.isIdentity(mat, 4, 3));
//        int[][] mat2 = {new int[]{1}};
//        System.out.println(E22a67.isIdentity(mat2, 0, 1));

        System.out.println(E22a67.maxMatrix(mat));
//        System.out.println(E22a89.longestSubarray(new int[]{-1, 1, -5, 2, 2,0,0,0,0,1,-2,1,0,1,-3,1,-1,1}));
//        System.out.println(E22a89.longestSubarray(new int[]{-2,-2}));
//        System.out.println(E22a89.longestSubarray(new int[]{1,2,3,4,5,4}));
//        System.out.println(E22a89.longestSubarray(new int[]{-8,7,1,-2,3,-4,-5,4,2,-4,6,2}));

//        String s1 = "adcfbaagcxabcd";
//        String s2 = "abc";
//
//        System.out.println(E22a89.isJump(s1,s2,4));
//        System.out.println(E22a89.strStep(s1,s2));

//        int[] arr = {10, 3, 40, 20, 50, 80, 70,900,81};
//        for (int n : arr) System.out.println(E23a54.findAlmostSorted(arr, n));
//        System.out.println(E23a54.findAlmostSorted(arr, 1000));

//        int[][] pathMat = {
//                new int[]{12, 22, 23, 54, 11},
//                new int[]{43, 35, 21, 20, 30},
//                new int[]{34, 23, 43, 22, 30},
//                new int[]{25, 31, 2, 20, 34},
//                new int[]{10, 22, 10, 11, 10},
//                new int[]{40, 13, 3, 1, 23},
//        };
//        System.out.println(E22b86.maxPath(pathMat));

//
//        System.out.println(E22b91.findTriplet(new int[]{-4, 1, 8, -9, 6}));
//        System.out.println(E22b91.findTriplet(new int[]{-4, -90, -5, -3}));


//        int[] stations1 = {2, 4, 8, 3, 10, 1, 12, 3, 2};
//        System.out.println("-------------\n" + E22b91.cheapRt(stations1, 3, 2, 4));
//        int[] kAlmost1 = {0, 0, 0, 0, 5, 7, 0};
//        int[] kAlmost2 = {0, 0, 0, 0, 5, 7, 0, 9};
//        System.out.println(E22b96.kAlmostSorted(kAlmost1, 7));
//        System.out.println(E22b96.kAlmostSorted(kAlmost1, 5));
//        System.out.println(E22b96.kAlmostSorted(kAlmost1, 3));
//        System.out.println(E22b96.kAlmostSorted(kAlmost2, 7));
//        System.out.println(E22b96.kAlmostSorted(kAlmost2, 5));
//        System.out.println(E22b96.kAlmostSorted(kAlmost2, 9));
//        System.out.println("-----------\n" + E22b96.calc(3, 36, 4));


//        int n = 0;
//        System.out.println("-------\n" + E23a65.countPairs(n));
//        System.out.println(E23a65.superInc(new int[]{1, 2, 4, 8, 900}, 909));


//        int[][] friends1 = {
//                new int[]{0, 1, 1},
//                new int[]{1, 0, 1},
//                new int[]{1, 1, 0},
//        };
//        int[][] friends2 = {
//                new int[]{0, 1, 1, 1},
//                new int[]{1, 0, 1, 1},
//                new int[]{1, 1, 0, 1},
//                new int[]{1, 1, 1, 0},
//        };
//        int[][] friends3 = {
//                new int[]{0, 1, 1, 1, 1},
//                new int[]{1, 0, 1, 1, 1},
//                new int[]{1, 1, 0, 1, 1},
//                new int[]{1, 1, 1, 0, 1},
//                new int[]{1, 1, 1, 1, 0},
//        };
//        int[][] friends4 = {
//                new int[]{0, 0, 1, 1, 1},
//                new int[]{0, 0, 1, 1, 0},
//                new int[]{1, 1, 0, 1, 1},
//                new int[]{1, 1, 1, 0, 1},
//                new int[]{1, 0, 1, 1, 0},
//        };
//        int[][] friends5 = {
//                new int[]{0, 1, 0, 0, 0, 1, 1, 0, 0, 0},
//                new int[]{1, 0, 1, 1, 0, 0, 0, 0, 0, 1},
//                new int[]{0, 1, 0, 0, 0, 1, 1, 0, 0, 1},
//                new int[]{0, 1, 0, 0, 0, 0, 1, 1, 0, 0},
//                new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
//                new int[]{1, 0, 1, 0, 0, 0, 0, 1, 1, 0},
//                new int[]{1, 0, 1, 1, 0, 0, 0, 1, 1, 0},
//                new int[]{0, 0, 0, 1, 0, 1, 1, 0, 0, 1},
//                new int[]{0, 0, 0, 0, 0, 1, 1, 0, 0, 0},
//                new int[]{0, 1, 1, 0, 1, 0, 0, 1, 0, 0},
//        };

//        System.out.println("------\n" + E23a72.friends3(friends1) + "\n\n");
//        System.out.println("------\n" + E23a72.friends3(friends2) + "\n\n");
//        System.out.println("------\n" + E23a72.friends3(friends3) + "\n\n");
//        System.out.println("------\n" + E23a72.friends3(friends4) + "\n\n");
//        System.out.println("------\n" + E23a72.friends3(friends5) + "\n\n");
    }
}