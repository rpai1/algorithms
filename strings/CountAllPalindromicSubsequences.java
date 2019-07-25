package strings;

/**
 * @author rashmi on 2019-07-16

 */

class CountAllPalindromicSubsequences {

    private static int countPalindromicSubsequence(String str, int i, int j) {

        if (i > j) {
            return 0;
        }
        if (i == j) {
            return 1;
        }

        if (str.charAt(i) == str.charAt(j)) {
            return 1 + countPalindromicSubsequence(str, i, j - 1)
                    + countPalindromicSubsequence(str, i + 1, j);
        }

        return countPalindromicSubsequence(str, i + 1, j)
                + countPalindromicSubsequence(str, i, j - 1)
                - countPalindromicSubsequence(str, i + 1, j - 1);
    }

    public static void main(String[] args) {
        String str = "abcb";
        int nums = countPalindromicSubsequence(str, 0, str.length() - 1);
        System.out.println(nums);
    }
}
