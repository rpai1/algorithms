package strings;

/**
 * @author rashmi on 2019-07-17

 */

class WildcardPatternMatchingRecursion {

    private static boolean patternMatch(char[] str, char[] pat, int m, int n, int i, int j) {
        if (i == m && j == n) {
            return true;
        } else if (i == m || j == n) {
            return false;
        }

        if (pat[j] == '?') {
            return patternMatch(str, pat, m, n, i + 1, j + 1);
        }

        if (pat[j] == str[i]) {
            return patternMatch(str, pat, m, n, i + 1, j + 1);
        } else if (pat[j] == '*') {
            return patternMatch(str, pat, m, n, i + 1, j) || patternMatch(str, pat, m, n, i, j + 1);

        }

        return false;
    }

    public static void main(String[] args) {

        String str = "baaabab";
        String pattern = "*****ba*****ab";
        // String pattern = "ba*****ab";
        // String pattern = "ba*ab";
        // String pattern = "a*ab";
        // String pattern = "a*****ab";
        // String pattern = "*a*****ab";
        // String pattern = "ba*ab****";
        // String pattern = "****";
        // String pattern = "*";
        // String pattern = "aa?ab";
        // String pattern = "b*b";
        // String pattern = "a*a";
        // String pattern = "baaabab";
        // String pattern = "?baaabab";
        // String pattern = "*baaaba*";

        if (patternMatch(str.toCharArray(), pattern.toCharArray(), str.length(), pattern.length(), 0, 0))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

