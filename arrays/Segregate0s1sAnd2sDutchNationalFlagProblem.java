package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class Segregate0s1sAnd2sDutchNationalFlagProblem {
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        segregate(arr, arr.length);
    }

    private static void segregate(int[] a, int n) {

        int lo = 0;
        int hi = n-1;
        int mid = 0;
        int temp =0;
        while(mid <= hi){
            switch (a[mid]){
                case 0:
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid ++;
                    break;
                case 2:
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }

    }
}
