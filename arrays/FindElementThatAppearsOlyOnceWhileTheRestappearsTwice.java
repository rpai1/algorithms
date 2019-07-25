package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class FindElementThatAppearsOlyOnceWhileTheRestappearsTwice {
    public static void main(String[] args) {
        int[] a= {7, 3, 5, 4, 5, 3, 4};
        int ele = findEle(a, a.length);
        System.out.println(ele);
    }

    private static int findEle(int[] a, int n) {
        int res = 0;

        for(int i=0; i< n ; i++){
            res = res ^ a[i];
        }
        return  res;
    }
}
