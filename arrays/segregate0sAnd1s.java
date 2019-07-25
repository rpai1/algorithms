package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class segregate0sAnd1s {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregate(a, a.length);
    }

    private static void segregate(int[] a, int n) {

        int count = 0;
        for(int i=0;i<n;i++){
            if(a[i] == 1) {
                count ++;
            }
        }

        for(int i=0;i<count;i++){
            a[i] = 1;
        }
        for(int i=count; i<n;i++){
            a[i] = 0;
        }

        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
