package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class EquilibriumIndexOfAnArray {
    public static void main(String[] args) {
        int[] a= { -7, 1, 5, 2, -4, 3, 0 };

        int idx = findEquilibriumIndex(a, a.length);
        System.out.println(idx);
    }

    private static int findEquilibriumIndex(int[] a, int n) {

        int sum =0;
        int leftSum = 0;

        for(int i=0; i<n;i++){
            sum +=a[i];
        }
        for(int i=0;i<n;i++){
            sum-=a[i];
            if(leftSum == sum){
                return i;
            }
            leftSum = leftSum + a[i];
        }

        return  -1;

    }
}
