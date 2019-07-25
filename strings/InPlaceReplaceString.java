package strings;

/**
 * @author rashmi on 2019-07-17

 */

class InPlaceReplaceString {

    private static String inPlaceReplace(String str, String pat) {

        while (str != null && (str.contains(pat))) {
            str = str.replaceFirst(pat, "x");
        }

        return str.replaceAll("xx", "x");

    }

    public static void main(String[] args) {

        String str = "GeeksForGeeks";
        String pattern = "Geeks";
        String res = inPlaceReplace(str, pattern);
        System.out.println(res);
    }
}
