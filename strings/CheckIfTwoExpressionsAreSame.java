package strings;

/**
 * @author rashmi on 2019-07-18

 */

import java.util.Stack;

class CheckIfTwoExpressionsAreSame {

    private static boolean areTheySame(String s1, String s2) {

        Stack<Character> st = new Stack<Character>();
        int i = 0;
        int end = 0, start = 0;
        int sum = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) != '(' && s1.charAt(i) != ')') {
                st.push(s1.charAt(i));
                i++;
            } else if (s1.charAt(i) == '(') {
                i++;
                start = i;
                while (s1.charAt(i) != ')') {
                    i++;
                }
                end = i - 1;
                sum = evaluate(s1, start, end);
                i++;
            }
        }

        String s1Final = String.valueOf(st.peek()) + sum;
        System.out.println(s1Final);

        int sum2 = evaluate(s2);
        String s2Final = String.valueOf(sum2);
        System.out.println(s1Final + " " + s2Final);
        return s1Final.equals(s2Final);
    }

    private static int evaluate(String s) {

        int sum = 0;
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) == '+') {
                int nextChar = s.charAt(i + 1) - 'a';
                sum = sum + nextChar;
                i = i + 2;
            } else if (s.charAt(i) == '-') {
                int nextChar = s.charAt(i + 1) - 'a';
                sum = sum - nextChar;
                i = i + 2;
            }
        }
        return sum;
    }

    private static int evaluate(String s, int start, int end) {

        String req = s.substring(start, end + 1);
        System.out.println(req);
        int j = 0;
        int sum = req.charAt(j) - 'a';
        j++;
        while (j < req.length() - 1) {
            if (req.charAt(j) == '+') {
                int nextChar = req.charAt(j + 1) - 'a';
                sum = sum + nextChar;
                j = j + 2;
            } else if (req.charAt(j) == '-') {
                int nextChar = req.charAt(j + 1) - 'a';
                sum = sum - nextChar;
                j = j + 2;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        String expr1 = "-(a-b+c)";
        String expr2 = "-a-b-c";
        boolean isSame = areTheySame(expr1, expr2);
        System.out.println(isSame);
    }
}
