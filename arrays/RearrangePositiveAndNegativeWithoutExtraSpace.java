package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class RearrangePositiveAndNegativeWithoutExtraSpace {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, -4, -1, 4};
        rearrange(a);

    }

    private static void rearrange(int[] a) {
        int i=-1;
        int temp =0;
        for(int j=0;j<a.length;j++){
            if(a[j]<0){
                i++;
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }

        int pos = i+1;
        int neg = 0;

        while(neg<pos && pos<a.length && a[neg]< 0) {
            temp = a[pos];
            a[pos] = a[neg];
            a[neg] = temp;
            pos ++;
            neg = neg+2;
        }

        for(i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}
