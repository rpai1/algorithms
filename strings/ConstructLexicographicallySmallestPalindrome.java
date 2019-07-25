package strings;

/**
 * @author rashmi on 2019-07-17

 */

class ConstructLexicographicallySmallestPalindrome {

    private static String constructPalin(char[] str, int n) {

        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (str[i] == str[j] && str[i] != '*') {
                i++;
                j--;
            } else if (str[i] != str[j]) {
                if (str[i] == '*' && str[j] != '*') {
                    str[i] = str[j];
                    i++;
                    j--;
                } else if (str[j] == '*' && str[i] != '*') {
                    str[j] = str[i];
                    i++;
                    j--;
                } else {
                    return null;
                }
            } else if (str[i] == str[j] && str[i] == '*') {
                str[i] = str[j] = 'a';
                i++;
                j--;
            }
        }

        return new String(str);

    }

    public static void main(String[] args) {
        String str = "bca*xc**b";
        int len = str.length();
        System.out.println(constructPalin(str.toCharArray(), len));
    }
}

