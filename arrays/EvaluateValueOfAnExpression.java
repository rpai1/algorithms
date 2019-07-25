package arrays;

/**
 * @author rashmi on 2019-07-18

 */

import java.util.Stack;

class EvaluateValueOfAnExpression {

    private static int evaluateBooleanExpression(String s) {

        Stack<Integer> st = new Stack<Integer>();

        st.push(Integer.valueOf(s.charAt(0) - '0'));
        int i = 1;
        while (i < s.length() - 1) {

            if (s.charAt(i) == 'A' || s.charAt(i) == 'B' || s.charAt(i) == 'C') {
                int value1 = Integer.valueOf(s.charAt(i + 1) - '0');
                int value2 = st.pop();
                int res = operate(s.charAt(i), value1, value2);
                st.push(res);
                i = i + 2;
            }
            System.out.println(st);
        }

        return st.peek();
    }

    private static int operate(char c, int a, int b) {
        int res = 0;
        if (c == 'A') {
            res = a != 0 && b != 0 ? 1 : 0;
        }
        if (c == 'B') {
            res = a != 0 || b != 0 ? 1 : 0;
        }
        if (c == 'C') {
            res = a ^ b;
        }
        System.out.println("here" + c + " " + a + " " + b + " " + res);

        return res;
    }

    public static void main(String[] args) {

        String s = "1C1B1B0A0";
        int n = evaluateBooleanExpression(s);
        System.out.println(n);
    }
}

