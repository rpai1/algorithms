package strings;

/**
 * @author rashmi on 2019-07-19

 */

import java.util.Arrays;

class MaxNumberIfCharactersBetweenTwoSameCharacters {

    private static int maxNumberOfCharactersBetweenAnyTwoCharacters(String str, int n) {

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, 0);
        Arrays.fill(last, 0);

        for (int i = 0; i < str.length(); i++) {
            if (first[str.charAt(i) - 'a'] == 0) {
                first[str.charAt(i) - 'a'] = i;
            } else if (first[str.charAt(i) - 'a'] != 0) {
                last[str.charAt(i) - 'a'] = i;
            }
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            int diff = last[i] - first[i];
            if (diff > max) {
                max = diff;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String str = "baaabcddc";
        int n = maxNumberOfCharactersBetweenAnyTwoCharacters(str, str.length());
        System.out.println(n);
    }
}
