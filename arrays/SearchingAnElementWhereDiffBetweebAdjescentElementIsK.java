package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class SearchingAnElementWhereDiffBetweebAdjescentElementIsK {
    public static void main(String[] args) {
        int[] a = {2, 4, 5, 7, 7, 6};
        int ele = 7;
        int k = 2;

        int pos = searchForElement(a, a.length, ele, k);
        System.out.println(pos);
    }

    private static int searchForElement(int[] a, int n, int ele, int k) {

        int i=0;
        while(i< n){
            if(a[i] == ele){
              return i;
            }
            else {
                i = i+ Math.max(1, ((a[i]- ele)/k));
            }
        }
        return i;
    }
}
