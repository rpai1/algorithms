package strings;

/**
 * @author rashmi on 2019-07-16

 */

class NBitGreyCodes {

    private static void generateNBitGreyCodes(char[] str, int j, int n) {
        if (j == n) {
            System.out.println(new String(str));
            return;
        }

        str[j] = '0';
        generateNBitGreyCodes(str, j + 1, n);

        str[j] = '1';
        generateNBitGreyCodes(str, j + 1, n);
    }

    public static void main(String[] args) {
        int num = 3;
        int k = Integer.valueOf(num);
        char[] temp = new char[k];
        temp[0] = '0';
        generateNBitGreyCodes(temp, 1, num);
        temp[0] = '1';
        generateNBitGreyCodes(temp, 1, num);
    }
}
