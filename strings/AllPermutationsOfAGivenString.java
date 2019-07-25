package strings;

/**
 * @author rashmi on 2019-07-17

 */

class AllPermutationsOfAGivenString {

    private static void permutation(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
            return;
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permutation(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static String swap(String str, int l, int r) {
        char[] ch = str.toCharArray();
        while (l < r) {
            char temp = ch[l];
            ch[l] = ch[r];
            ch[r] = temp;
            l++;
            r--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String str = "ABCD";
        char[] res = new char[str.length()];
        permutation(str, 0, str.length() - 1);
    }
}

