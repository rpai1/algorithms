package strings;

/**
 * @author rashmi on 2019-07-15

 */
//This also solves Minimum steps to delete a string after repeated deletion of palindrome substrings
    // the idea is to find LPS, keep deleting LPS till teh string is empty.
class LongestpalindromicSubstring {
    private static String longestPalindrominSubstring(String str, int n) {

        int max = 0, index = 0;
        for (int i = 0; i < n; i++) {
            int l1 = explandInThemIddle(str, i, i);
            int l2 = explandInThemIddle(str, i, i + 1);
            if (Math.max(l1, l2) > max) {
                max = Math.max(l1, l2);
                index = l1 > l2 ? i - l1 / 2 : i - l2 / 2 + 1;
            }
        }
        return str.substring(index, index + max);
    }

    private static int explandInThemIddle(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 2 + 1; // -2 to decrease increased counts of previous itiration
    }

    public static void main(String[] args) {
        String str = "babad";
        String res = longestPalindrominSubstring(str, str.length());
        System.out.println(res);
    }
}


