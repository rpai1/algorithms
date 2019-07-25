package strings;

/**
 * @author rashmi on 2019-07-18

 */

import java.util.Stack;

class PreFixPostFixInFixConversions {

    private static String prefixToInfix(String str) {

        Stack<String> st = new Stack<String>();

        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            if (!isOperator(str.charAt(i))) {
                st.push(String.valueOf(str.charAt(i)));
            } else if (isOperator(str.charAt(i))) {
                String s1 = st.pop();
                String s2 = st.pop();
                String res = "(" + s1 + " " + str.charAt(i) + " " + s2 + ")";
                st.push(res);
            }
        }

        return st.peek();
    }

    private static String prefixToPostFix(String str) {
        Stack<String> st = new Stack<String>();

        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            if (!isOperator(str.charAt(i))) {
                st.push(String.valueOf(str.charAt(i)));
            } else if (isOperator(str.charAt(i))) {
                String s1 = st.pop();
                String s2 = st.pop();
                String res = s1 + " " + s2 + " " + str.charAt(i);
                st.push(res);
            }
        }

        return st.peek();
    }

    private static String postFixToPreFix(String str) {
        Stack<String> st = new Stack<String>();

        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (!isOperator(str.charAt(i))) {
                st.push(String.valueOf(str.charAt(i)));
            } else if (isOperator(str.charAt(i))) {
                String s1 = st.pop();
                String s2 = st.pop();
                String res = str.charAt(i) + " " + s1 + " " + s2;
                st.push(res);
            }
        }

        return st.peek();
    }

    private static String postFixToInfix(String str) {
        Stack<String> st = new Stack<String>();

        int n = str.length();

        for (int i = 0; i < n; i++) {
            if (!isOperator(str.charAt(i))) {
                st.push(String.valueOf(str.charAt(i)));
            } else if (isOperator(str.charAt(i))) {
                String s1 = st.pop();
                String s2 = st.pop();
                String res = "(" + " " + s1 + " " + str.charAt(i) + " " + s2 + " " + ")";
                st.push(res);
            }
        }

        return st.peek();
    }

    private static boolean isOperator(char ch) {

        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "*-A/BC-/AKL";
        String res = prefixToInfix(str);
        System.out.println(res);

        String str2 = "*-A/BC-/AKL";
        String res2 = prefixToPostFix(str2);
        System.out.println(res2);

        String str3 = "ABC/-AK/L-*";
        String res3 = postFixToPreFix(str3);
        System.out.println(res3);

        String str4 = "ABC/-AK/L-*";
        String res4 = postFixToInfix(str4);
        System.out.println(res4);
    }
}
