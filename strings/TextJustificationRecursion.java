package strings;

/**
 * @author rashmi on 2019-07-19

 */

class TextJustificationRecursion {

    private static void textJustification(String[] str, String[] res, int i, int j, int maxWidth) {

        if (i == str.length) {
            for (int k = 0; k < res.length; k++) {
                if (res[k] != null) {
                    System.out.println(res[k]);
                }
            }
            return;
        }

        if ((res[j].length() + str[i].length()) <= maxWidth) {
            res[j] = res[j] + str[i] + " ";
            textJustification(str, res, i + 1, j, maxWidth);
        } else {
            if (res[j + 1] != null) {
                res[j + 1] = res[j + 1] + str[i] + " ";
            } else {
                res[j + 1] = str[i] + " ";
            }
            textJustification(str, res, i + 1, j + 1, maxWidth);

        }
    }

    public static void main(String[] args) {
        String[] str = {"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain",
                "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"};
        int maxWidth = 20;
        String[] res = new String[str.length + 1];
        res[0] = str[0] + " ";
        textJustification(str, res, 1, 0, maxWidth);
    }
}
