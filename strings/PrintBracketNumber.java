package strings;

/**
 * @author rashmi on 2019-07-18

 */

class PrintBracketNumber {

    private static void printBracketNumber(String str) {
        int n = str.length();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                count++;
                System.out.print(count);
            } else if (str.charAt(i) == ')') {
                System.out.print(count);
                count--;
            }
        }

    }

    public static void main(String[] args) {
        String str = "(a+(b*c))+(d/e)";
        printBracketNumber(str);
    }
}
