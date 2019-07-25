package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class RearrangePositiveAndNegativeNumbers {
    public static void main(String[] args) {
        int[] a = {12, 11, -13, -5, 6, -7, 5, -3, -6};
        rearrange(a);
    }

    private static void rearrange(int[] a) {
        int count =0;
        int temp;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                temp = a[count];
                a[count] = a[i];
                a[i] = temp;
                count++;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
