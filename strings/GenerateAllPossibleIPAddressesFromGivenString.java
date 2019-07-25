package strings;

/**
 * @author rashmi on 2019-07-19

 */

class GenerateAllPossibleIPAddressesFromGivenString {

    private static void generateAllPossibleIpAddresses(String str, char[] temp, int i, int j, int n) {

        if (i == n) {
            if (isValidIp(temp, 0, j)) {
                System.out.println(new String(temp).substring(0, j));
            }
            return;
        }

        temp[j] = str.charAt(i);
        generateAllPossibleIpAddresses(str, temp, i + 1, j + 1, n);

        temp[j] = '.';
        temp[j + 1] = str.charAt(i);
        generateAllPossibleIpAddresses(str, temp, i + 1, j + 2, n);
    }

    private static boolean isValidIp(char[] temp, int i, int j) {

        String st = new String(temp).substring(i, j);
        String[] split = st.split("[.]");
        if (split.length != 4 ) {
            return false;
        }
        if (split[0].length() != 3 || split[1].length() != 3) {
            return false;
        }
        for(int k=0;k< split.length;k++){
            if(split[k].length() > 3){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "25525511135";
        char[] temp = new char[str.length() * 2];
        temp[0] = str.charAt(0);
        generateAllPossibleIpAddresses(str, temp, 1, 1, str.length());
    }
}
