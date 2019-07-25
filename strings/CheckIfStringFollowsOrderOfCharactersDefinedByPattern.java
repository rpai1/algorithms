package strings;

/**
 * @author rashmi on 2019-07-17

 */

class CheckIfStringFollowsOrderOfCharactersDefinedByPattern {

    private static boolean checkPattern(String str, String pattern) {

        char[] strs = str.toCharArray();
        char[] pat = pattern.toCharArray();

        int count = 0;

        int m = strs.length;
        int n = pat.length;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (strs[i] == pat[j]) {
                i++;
                j++;
                count++;
            } else {
                i++;
            }
        }

        if (count == n) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        String str = "engineers rock";
        String pattern = "gsr";
        System.out.println(checkPattern(str, pattern));
    }
}
