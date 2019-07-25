package dynamicprogramming;

import java.util.Arrays;

/**
 * @author rashmi on 2019-07-22

 */
public class NCRModuloP {
    public static void main(String[] args) {
        int n = 10, r = 2, p = 13;
        System.out.println("Value of nCr % p is "
                + nCrModp(n, r, p));
    }

    private static int nCrModp(int n, int r, int p) {
        int[] c = new int[r+1];
        Arrays.fill(c,0);
        c[0] = 1;

        for(int i=1; i<=n;i++){
            for(int j = Math.min(i, r); j>0; j--){
                c[j] = (c[j] + c[j-1])%p;
            }
        }
     return c[r];
    }
}
