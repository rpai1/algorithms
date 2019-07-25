package strings;

/**
 * @author rashmi on 2019-07-18

 */

import java.util.Stack;

class CheckIfBracketsAreBalanced {

    private static boolean areParenthesisBalanced(char[] exp) {

        Stack<Character> st = new Stack<Character>();


        for (int i = 0; i < exp.length; i++) {

            if (exp[i] == '(' || exp[i] == '[' || exp[i] == '{') {
                st.push(exp[i]);
            } else if (exp[i] == ')' || exp[i] == ']' || exp[i] == '}') {
                if (st.isEmpty()) {
                    return false;
                }

                if (!matchingPair(st.pop(), exp[i])) {
                    return false;
                }
            }

        }

        if (!st.isEmpty()) {
            return false;
        }
        return true;
    }

    private static boolean matchingPair(char c1, char c2) {

        if (c1 == '(' && c2 == ')') {
            return true;
        }

        if (c1 == '{' && c2 == '}') {
            return true;
        }
        if (c1 == '[' && c2 == ']') {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {

        char exp[] = {'{', '(', ')', '}', '[', ']'};
        if (areParenthesisBalanced(exp))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}

