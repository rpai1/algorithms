package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class MergeAnArrayIntoAnotherMPlusN {

    public static void main(String[] args) {
        int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20};
        int n[] = {5, 7, 9, 25};
        mergeIntoSingleArray(mPlusN, n, mPlusN.length, n.length);
    }

    private static void mergeIntoSingleArray(int[] mPlusN, int[] n, int mPlusnLen, int nLen) {

        moveAllElementsToTheright(mPlusN, mPlusnLen);
        printArray(mPlusN);

        int m = mPlusnLen - nLen;

        int i=nLen;
        int j=0;
        int k=0;

        while( k < (m + nLen)) {

            if((i< (m + nLen) && mPlusN[i] <= n[j]) || (j== nLen) ){
                mPlusN[k] = mPlusN[i];
                i++;
                k++;
            }
            else {
                mPlusN[k] = n[j];
                j++;
                k++;
            }
        }
        printArray(mPlusN);
    }

    private static void printArray(int[] a) {
        for(int i=0;i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void moveAllElementsToTheright(int[] mPlusN, int mPlusnLen) {
        int j= mPlusnLen-1;

        for( int i= mPlusnLen-1; i>=0; i--){

            if(mPlusN[i] != -1){
                mPlusN[j] = mPlusN[i];
                j--;
            }
        }
    }
}
