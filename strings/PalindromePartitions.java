package strings;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-16

 */

class PalindromePartitions {
    private static void printAllPartitions(String str, char[] res, int i, int j, int n) {

        if (i == n) {
            String temp = new String(res).substring(0, j);
            if (isPalindromeUtil(temp)) {
                System.out.println(temp);
            }
            return;
        }

        res[j] = str.charAt(i);
        printAllPartitions(str, res, i + 1, j + 1, n);

        res[j] = ' ';
        res[j + 1] = str.charAt(i);
        printAllPartitions(str, res, i + 1, j + 2, n);
    }

    private static boolean isPalindromeUtil(String str) {
        String[] strs = str.split(" ");
        for (String s : strs) {
            if (!isPalindrome(s)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(String str) {
        // System.out.println("str is:" + str);
        int i1 = 0;
        int i2 = str.length() - 1;
        while (i1 < i2) {
            if (str.charAt(i1) != str.charAt(i2)) {
                return false;
            }
            i1++;
            i2--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "nitin";
        char[] res = new char[2 * str.length()];
        res[0] = str.charAt(0);
        printAllPartitions(str, res, 1, 1, str.length());
    }
}

