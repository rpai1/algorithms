package strings;

/**
 * @author rashmi on 2019-07-18

 */

class ConvertASentenceINtoEquivilantMobileNUmeric {

    private static String printSequence(String[] input, String str) {

        String res = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            int j = 0;
            for (String s : input) {
                if (s.indexOf(currentChar) >= 0) {
                    int m = s.indexOf(currentChar);
                    res = res + updateCharacterWithMNumberOfTimes(m + 1, j + 1);
                }
                j++;
            }
        }
        return res;

    }

    private static String updateCharacterWithMNumberOfTimes(int m, int j) {
        String temp = "";
        for (int i = 0; i < m; i++) {
            temp = temp + j;
        }
        return temp;
    }

    public static void main(String[] args) {

        String[] str = {"1", "abc", "def",
                "ghi", "jkl", "mno",
                "pqrs", "tuv", "wxyz"};

        String input = "geeksforgeeks";
        System.out.println(printSequence(str, input));
    }
}

