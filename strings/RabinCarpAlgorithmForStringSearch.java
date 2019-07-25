package strings;

/**
 * @author rashmi on 2019-07-11

 */

class RabinCarpAlgorithmForStringSearch {

    private static void searchRabinKarp(String pat, String txt) {

        int primeNum = 3;
        int patHash = 0;

        int m = txt.length();
        int n = pat.length();
        for (int i = 0; i < n; i++) {
            int chInt = pat.charAt(i) - 'A';
            patHash = patHash + (chInt * (int) Math.pow(primeNum, i));
        }
        System.out.println("pat hash is:" + patHash);

        int i = 0;
        int txtHash = calculateTxtHash(txt.substring(i, i + n), i, i + n, primeNum);

        System.out.println("initial txtHash is:" + txtHash);
        if (txtHash == patHash) {
            if (compare(pat, txt.substring(i, i + n - 1))) {
                System.out.println(" done at:" + i);
                return;
            }
        }
        i = 1;
        while (i < m && m - i >= n) {
            txtHash = recalculateHash(txtHash, primeNum, txt.charAt(i + n - 1), txt.charAt(i - 1), n);

            if (txtHash != patHash) {
                i++;
            } else {
                if (compare(pat, txt.substring(i, i + n))) {
                    System.out.println("Found at: " + i);
                    i++;
                }
            }
        }
    }

    private static boolean compare(String a, String b) {
        return a.equals(b);
    }

    private static int recalculateHash(int txtHash, int primeNum, char newChar, char oldChar, int n) {
        int oldC = oldChar - 'A';
        int newC = newChar - 'A';
        int m = ((txtHash - oldC) / primeNum);
        int k = newC * (int) Math.pow(primeNum, n - 1);
        return m + k;
    }

    private static int calculateTxtHash(String txt, int start, int end, int primeNum) {

        int hash = 0;
        for (int i = start; i < end; i++) {
            int intC = txt.charAt(i) - 'A';
            hash = hash + (intC * (int) Math.pow(primeNum, i));
        }
        return hash;
    }

    public static void main(String[] args) {
        String txt = "BBCDABCDA";
        String pat = "BCDA";
        searchRabinKarp(pat, txt);
    }
}



