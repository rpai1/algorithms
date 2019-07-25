package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class CountInversions {
    public static void main(String[] args) {
        int[] a= { 1, 20, 6, 4, 5 };
        int c = countInversions(a, a.length);
        System.out.println(c);
    }

    private static int countInversions(int[] a, int n) {
        int count =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
