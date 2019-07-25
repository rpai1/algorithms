package strings;

/**
 * @author rashmi on 2019-07-09

 */

class CountWordsInAGivenString {
    private static int countWords(String str) {
        int count = 0;
        int n = str.length();
        int i = 0;
        int state = 0;

        while (i < n) {

            if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
                state = 0;
            } else if (state == 0) {
                state = 1;
                count++;
            }
            i++;

        }

        return count;

    }

    public static void main(String[] args) {
        String str = "One two       three\n four\tfive  ";
        System.out.println("No of words : " + countWords(str));
    }
}


