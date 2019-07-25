package dynamicprogramming;

/**
 * @author rashmi on 2019-07-24

 */
public class SumOfIndividualSubstringsInaNumString {
    public static void main(String[] args) {
        String str = "12";
        System.out.println(findSumSubstrings(str));
    }

    private static int findSumSubstrings(String str) {
        int[] tempSum = new int[str.length()];

        tempSum[0] = toDigit(str.charAt(0));
        int res=tempSum[0];
        for(int i=1; i<str.length();i++){
            tempSum[i] = (10*tempSum[i-1]) + toDigit(str.charAt(i));

            res = res + tempSum[i];
        }
        return res;
    }


    private static int toDigit(char ch){
        return (ch - '0');
    }
}
