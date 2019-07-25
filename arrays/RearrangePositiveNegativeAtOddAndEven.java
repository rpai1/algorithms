package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class RearrangePositiveNegativeAtOddAndEven {
    public static void main(String[] args) {
        int[] arr = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10};
        int n = arr.length;
        rearrangePositiveOddNegativeEven(arr, n);
    }

    private static void rearrangePositiveOddNegativeEven(int[] a, int n) {

        int positive = 0;
        int negative = 1;
        int temp;
        while(true){

            while(positive < n && a[positive] >=0 ){
                positive = positive +2;
            }

            while(negative < n && a[negative]<0){
                negative = negative+2;
            }

            if(positive < n && negative < n) {
                temp = a[positive];
                a[positive] = a[negative];
                a[negative] = temp;
            }
            else {
                break;
            }

        }

        for(int i=0; i<n; i++){
            System.out.print(a[i]+ " ");
        }
    }
}
