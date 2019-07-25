package strings;

/**
 * @author rashmi on 2019-07-18

 */

class MaximumDepthOfNestedParanthesis {

    private static int maxDepth(String s) {

        int n = s.length();
        int max = Integer.MIN_VALUE;
        int currentMax = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                currentMax++;
            } else if (s.charAt(i) == ')') {
                if (currentMax > 0) {
                    currentMax--;
                } else {
                    return -1;
                }
            }
            if (currentMax > max) {
                max = currentMax;
            }
        }

        if (currentMax != 0) {
            return -1;
        }
        return max;

    }

    public static void main(String[] args) {

        String s = "( ((X)) (((Y))) )";
        System.out.println(maxDepth(s));
    }
}
