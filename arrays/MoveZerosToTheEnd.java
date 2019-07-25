package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        int[] a = {0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        moveZeros(a);
    }

    private static void moveZeros(int[] a) {
        int count = 0;
        int temp;

        for(int i=0;i<a.length;i++){
            if(a[i]> 0){
                temp = a[i];
                a[i] = a[count];
                a[count] = temp;
                count++;
            }
        }

        for(int i=0; i<a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }

}
