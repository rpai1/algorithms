package strings;

/**
 * @author rashmi on 2019-07-15

 */

import java.util.ArrayList;
import java.util.List;

class PrintAllPalindromicSubstringsInAGivenString {
    private static List<String> printAllPalindromicSubstrings(String str, int n) {

        List<String> palList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int l1 = expand(str, i, i);
            int l2 = expand(str, i, i + 1);
            count = count + Math.max(l1, l2);
            palList.add(str.substring(i, i + l1));
            palList.add(str.substring(i, i + l2));
        }

        System.out.println(count);

        return palList;

    }

    private static int expand(String str, int left, int right) {

        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 2 + 1; // -2 decrease to reduce the count that was increased in
        //previous itiratoon
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        List<String> res = printAllPalindromicSubstrings(str, str.length());
        for (String s : res) {
            System.out.print(s + " ");
        }
    }
}
