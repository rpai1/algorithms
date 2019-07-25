package strings;

/**
 * @author rashmi on 2019-07-16

 */

class NextGreaterBinaryString {

    private static String nextGreater(String str) {
        int n = str.length();

        char[] ch = str.toCharArray();
        int i;

        for (i = n - 1; i >= 0; i--) {
            if (ch[i] == '1') {
                ch[i] = '0';
            } else {
                ch[i] = '1';
                break;
            }
        }

        String res = new String(ch);
        if (i < 0) {
            res = '1' + res;
        }

        return res;
    }

    public static void main(String[] args) {
        String num = "10011";
        System.out.println("Binary representation of next number = "
                + nextGreater(num));
    }
}
