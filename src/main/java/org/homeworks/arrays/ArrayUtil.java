package org.homeworks.arrays;

public class ArrayUtil {

    /**
     * find positive mebers of array
     * @param arr
     * @return
     */

    public static int[] getPositiveMembers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        int[] positiveArr = new int[count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveArr[j] = arr[i];
                j++;
            }
        }
        return positiveArr;
    }

    /**
     * reverse
     */
    void reverseArray() {
        short[] s = new short[]{324, 258, 123};
        for (int i = 0; i < s.length; i++) {
            String str = Short.toString(s[i]);
            StringBuffer reverse = new StringBuffer(str).reverse();
            System.out.println(reverse);
        }
    }

    /**
     * max value of array
     */
    void maxValue() {
        long[] l = new long[]{-4, 5, 68, 98, 4, 0, 69};
        // System.out.println(Arrays.stream(l).max()); *** variant 1
        long max = l[0];
        for (int i = 1; i < l[i]; i++) {
            if (l[i] > max) {
                max = l[i];
            }
        }
        System.out.println(max); // *** variant 2
    }

    /**
     * smallest array
     */
     public static float minValue(float[] f) {

        float min = f[0];
        for (int i = 1; i < f[i]; i++) {
            if (f[i] < min) {
                min = f[i];
            }
        }
        return min;

    }

    /**
     * replace arrays
     */
    void replaceArrays() {
        int[] m = new int[]{1, 5, 69, 78, 12, 45, 65};
        int[] n = new int[m.length];

        for (int i = 0; i < m.length; i++) {
            n[i] = m[i];
            System.out.println(n[i]);
        }

    }

    /**
     * sum arrays
     */
    void sumArrays() {
        int[] m = new int[]{1, 5, 69, 78, 12, 45, 65};
        int[] n = new int[]{2, 6, 89, 45, 2, 35, 987};
        int[] k = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            k[i] = m[i] + n[i];
            System.out.println(k[i]);
        }

    }

    /**
     * comparison with k=5
     */
    void matchArray() {
        int k = 5;
        int match = 0;
        int[] m = new int[]{1, 5, 69, 78, 5, 45, 65};
        for (int i = 0; i < m.length; i++) {
            if (m[i] == k) {
                match++;
            }
        }
        System.out.println(match);
    }


    /**
     * sort in ascending order
     */
    void method() {
        int[] arr = new int[]{1, 5, 9, 8, 3, 4};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }

    /**
     * find odd arrays
     */
    void oddArrays() {
        int[] arr = new int[]{1, 5, 9, 8, 3, 4};
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] % 2 == 1) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }


    /**
     * remove zeros
     */
    void deleteArr() {
        int[] m = new int[]{1, 0, 6, 4, 9, 0, 0};
        int[] n = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            if (m[i] != 0) {
                n[i] = m[i];
            } else continue;
            System.out.println(n[i]);
        }
    }

    void binaryArrays(int[] a) {
        int sum = 0;
        for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
            sum += a[i] * (int) Math.pow(2, j);
        }
        System.out.println(sum);
    }


    void matrix1() {

        int a[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {

                System.out.print(a[i][j] + " ");

            }
        }
    }


     public static  int[][]  matrix2(int[][] a) {

        int b[][] = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }

    //16
    void matrix3() {
        int a[][] = {{1, 2, 3, 5},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}};
        int sum = 0;
        boolean d = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += a[i][j];

                }
            if (sum % 2 == 0) {
                d = true;
            } else {
                d = false;
                break;
            }
        }
        if (d) {
            System.out.println("yes");
        } else System.out.println("no");

    }



    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
//        arrayUtil.positiveArrays();
//        arrayUtil.reverseArray();
//        arrayUtil.maxValue();
//        arrayUtil.minValue();
//        arrayUtil.replaceArrays();
//        arrayUtil.sumArrays();
//        arrayUtil.matchArray();
//        arrayUtil.oddArrays();
//        arrayUtil.deleteArr();
//        arrayUtil.method();
//        matrix2(a);

    }


}



