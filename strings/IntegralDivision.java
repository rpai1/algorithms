package strings;

/**
 * @author rashmi on 2019-07-17

 */

class IntegralDivision {

    private static int getPosForIntegralDivision(String str) {

        int n = str.length();

        for (int i = 1; i < n; i++) {
            String s1 = str.substring(0, i);
            String s2 = str.substring(i, n);

            System.out.println(s1 + " " + s2);
            Long s2Long = Long.parseLong(s2);
            Long s1Long = Long.parseLong(s1);

            if (s1Long * 10 == s2Long) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String str = "2202200";
        int pos = getPosForIntegralDivision(str);
        System.out.println(pos);
    }
}
