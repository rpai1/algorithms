package strings;

/**
 * @author rashmi on 2019-07-16

 */

class NumberOfBinaryStringsWithoutConsecutiveOnes {

    private static int numberOfBinaryStringsWithoutConsecutiveOnes(int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        a[0] = b[0] = 1;
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1];
        }

        return a[n - 1] + b[n - 1];

    }
// to count umber of strings with consecutive ones, do 2^n - (a[n-1+ b[n-1); basically subtract the sum from 2^n;
    public static void main(String[] args) {
        int n = 3;
        System.out.println(numberOfBinaryStringsWithoutConsecutiveOnes(n));
    }
}
