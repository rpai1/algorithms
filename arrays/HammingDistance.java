package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class HammingDistance {
    public static void main(String[] args) {
        int[] a= {2, 4, 6, 8};
        System.out.println(findMaxHam(a, a.length));
    }

    private static int findMaxHam(int[] a, int n) {
        int[] temp = new int[2*n+1];

        for(int i=0;i<n;i++){
            temp[i] = a[i];
            temp[n+i] = a[i];
        }

        int maxHam = 0;
        for(int i=1;i<n;i++){
            int curHam = 0;
            for(int j=i, k=0; j<(n+i); j++, k++){
                if(temp[j] != a[k]){
                    curHam ++;
                }
                if(curHam == n){
                    return n;
                }
                maxHam = Math.max(maxHam, curHam);
            }
        }
        return maxHam;
    }
}
