package strings;

/**
 * @author rashmi on 2019-07-18

 */

import java.util.Stack;

class IdentifyAndMarkMissingParanthesis {

    private static void identifyParenthesis(String str) {

        Stack<Character> st = new Stack<Character>();

        int n = str.length();


        int i = 0;
        int index = 0;
        while (i < n) {
            if (str.charAt(i) == '(') {
                st.push(str.charAt(i));
                i++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                st.push(str.charAt(i));
                i++;
            } else if (str.charAt(i) == ')') {
                st.push(str.charAt(i));
                i++;
                while (st.size() >= 1 && st.peek() != '(') {
                    char ch = st.pop();
                    if (ch == ')' && !st.isEmpty()) {
                        System.out.print("0");
                    } else if (ch == ')' && st.isEmpty()) {
                        System.out.print("-1");
                    } else if (ch >= 'a' && ch <= 'z') {
                        System.out.print(ch);
                    }

                }
                if (!st.isEmpty()) {
                    char ch2 = st.pop();
                    System.out.print("0");
                }
            }
        }
    }

    public static void main(String[] args) {

        String str = "(((abc))((d)))))";
        identifyParenthesis(str);
    }
}
