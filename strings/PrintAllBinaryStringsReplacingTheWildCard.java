package strings;

/**
 * @author rashmi on 2019-07-16

 */

class PrintAllBinaryStringsReplacingTheWildCard {

    private static void print(char[] str, int index, int n) {
        if (index == n) {
            System.out.println(new String(str));
            return;
        }

        if (str[index] == '?') {
            str[index] = '0';
            print(str, index + 1, n);

            str[index] = '1';
            print(str, index + 1, n);

            str[index] = '?';
        } else {
            print(str, index + 1, n);
        }
    }

    public static void main(String[] args) {
        String input = "1??0?101";
        char[] str = input.toCharArray();
        print(str, 0, str.length);
    }
}
