package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class RearrangeOutOfPlace {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, -4, -1, 4};
        rearrangeWithoutExtraSpaceInplaceMaintainOrder(a);
    }

    private static void rearrangeWithoutExtraSpaceInplaceMaintainOrder(int[] a) {
        int outOfPlace = -1;
        for(int i=0; i<a.length; i++) {
            if(outOfPlace>=0) {

                if((a[i]>=0 && a[outOfPlace]<0) || a[i]<0 && a[outOfPlace]>0) {
                    rightRotate(a, a.length, outOfPlace, i);

                    if (i - outOfPlace > 2) {
                        outOfPlace = outOfPlace + 2;
                    } else {
                        outOfPlace = -1;
                    }
                }
            }

            if(outOfPlace == -1) {
                if((a[i] >0 && (i%2) == 0) || a[i]<0 && (i%2) == 1){
                    outOfPlace = i;
                }
             }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    private static void rightRotate(int[] a, int length, int outOfPlace, int cur) {
        int temp = a[cur];
        for(int i=cur; i>outOfPlace; i--){
            a[i] = a[i-1];
        }
        a[outOfPlace] = temp;
    }
}
