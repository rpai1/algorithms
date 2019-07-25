package strings;

/**
 * @author rashmi on 2019-07-18

 */

class MinimumSwapsForBracketBalancing {

    private static int swapsCount(String str) {

        int pendingTobeMatched = 0;
        int swaps = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '[') {
                if (pendingTobeMatched > 0) {
                    swaps = swaps + pendingTobeMatched;
                }
                pendingTobeMatched--;
            } else if (str.charAt(i) == ']') {
                pendingTobeMatched++;
            }
        }
        return swaps;

    }

    public static void main(String[] args) {

        String s = "[]][][";
        int n = swapsCount(s);
        System.out.println(n);
    }
}
