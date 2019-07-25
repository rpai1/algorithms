package arrays;

import java.util.HashSet;

/**
 * @author rashmi on 2019-07-04

 */
public class FindOnlyOneDuplicateInAnArray {
    public static void main(String[] args) {
        int[] a = {1, 5, 1, 2, 3, 4};
        int[] a1= {1, 5, 1, 2, 3, 4}, a2={1, 5, 1, 2, 3, 4}, a3={1, 5, 1, 2, 3, 4};
        int ele1 = findMissingUsingHashing(a, a.length);
        int ele2 = fibdMissingUsingXOR(a1, a.length);
        int ele3 = findMissingUsingnegation(a2, a.length);
        int ele4 = findMissingUsingSum(a3, a.length);

        System.out.println(ele1 + " "+ ele2 + " "+ ele3 + " "+ ele4);
    }

    private static int findMissingUsingSum(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        return sum - (((n - 1) * n) / 2);
    }

    private static int findMissingUsingnegation(int[] a, int n) {

        int missingEle = 0;

        for( int i=0; i<n; i++){
            if( a[Math.abs(a[i])]< 0){
                missingEle = a[i];
                break;
            }
            a[ Math.abs(a[i])] = -a[ Math.abs(a[i])];
        }
        return  Math.abs(missingEle);
    }

    private static int fibdMissingUsingXOR(int[] a, int n) {
        int res= 0;
        for( int i=1; i<n ; i++){
          res = res ^ i;
        }

        int arrayRes = a[0];
        for( int i=1; i< n ;i++) {
            arrayRes = arrayRes ^ a[i];
        }

        return res ^ arrayRes;
    }

    private static int findMissingUsingHashing(int[] a, int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i< n; i++){
            if(hashSet.contains(a[i])){
                return  a[i];
            }
            hashSet.add(a[i]);
        }
        return -1;
    }


}
