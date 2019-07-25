package strings;

/**
 * @author rashmi on 2019-07-16

 */

class NumberOFFlipsToMakeBinaryStringAlternate {

    private static int flipString(String str, char expected) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != expected) {
                count++;
            }
            expected = flip(expected);
        }
        return count;
    }

    private static char flip(char i) {
        return i == '0' ? '1' : '0';
    }

    private static int minFlipToMakeStringAlternate(String str) {

        return Math.min(flipString(str, '1'), flipString(str, '0'));

    }

    public static void main(String[] args) {
        String str = "0001010111";
        System.out.println(minFlipToMakeStringAlternate(str));
    }
}
