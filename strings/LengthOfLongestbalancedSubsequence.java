package strings;

/**
 * @author rashmi on 2019-07-18

 */

import java.util.Stack;

class LengthOfLongestbalancedSubsequence {

    static int max = Integer.MIN_VALUE;

    private static int maxLengthLBS(String str, int k, int n) {

        Stack<Character> st = new Stack<Character>();

        int count = 0;
        for (int i = 0; i < n; i++) {

            if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else if (str.charAt(i) == ')') {
                if (!st.isEmpty()) {
                    while (!st.isEmpty() && st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                    count = count + 2;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {

        String s = "()(((((()";
        int n = s.length();
        System.out.println(maxLengthLBS(s, 0, n));
    }
}
