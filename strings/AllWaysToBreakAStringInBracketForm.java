package strings;

/**
 * @author rashmi on 2019-07-18

 */

class AllWaysToBreakAStringInBracketForm {

    private static void printAllWays(String str, String temp, int index, int n) {

        if (index == n) {
            System.out.println(temp);
            return;
        }

        for (int i = index; i < n; i++) {
            printAllWays(str, temp + "(" + str.substring(index, i + 1) + ")", i + 1, n);
        }

    }

    public static void main(String[] args) {

        String s = "abcd";
        String temp = "";
        printAllWays(s, temp, 0, s.length());
    }
}
