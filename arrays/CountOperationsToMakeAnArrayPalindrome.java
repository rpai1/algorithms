package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class CountOperationsToMakeAnArrayPalindrome {
    public static void main(String[] args) {
        int[] a= {1, 4, 5, 9, 1};
        int count = countOperations(a, a.length);
        System.out.println(count);
    }

    private static int countOperations(int[] a, int n) {

        int res = 0;
        for(int i=0, j= n-1; i<=j ;){

            if(a[i] == a[j]){
                i++;
                j--;
            }

            else if(a[i] > a[j]) {
                j--;
                a[j] = a[j] + a[j+1];
                res++;
            }
            else {
                i++;
                a[i] = a[i] + a[i-1];
                res++;
            }
        }
        return res;
    }
}
