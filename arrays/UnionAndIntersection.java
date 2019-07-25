package arrays;

/**
 * @author rashmi on 2019-07-03

 */
public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5, 6};
        int arr2[] = {2, 3, 5, 7};
        printUnion(arr1, arr2, arr1.length, arr2.length);
        System.out.println();
        printInterSection(arr1, arr2, arr1.length, arr2.length);
    }

    private static void printInterSection(int[] a, int[] b, int m, int n) {

        int i=0, j=0;

        while(i<m && j<n) {
            if(a[i] == b[j]){
                System.out.print( a[i] + " ");
                i++;
                j++;
            }
            else if( a[i] < b[j]){
                i++;
            }
            else if(a[i] > b[j]) {
                j++;
            }
        }
    }

    private static void printUnion(int[] a, int[] b, int m, int n) {

        int i=0, j=0;
        while(i<m && j<n ){
            if(a[i] == b[j]){
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                System.out.print(a[i] + " ");
                i++;
            }
            else if(a[i] > b[j]){
                System.out.print(b[j] + " ");
                j++;
            }
        }

        for(; i<m; i++){
            System.out.print(a[i] + " ");
        }
        for(; j<n; j++){
            System.out.print(b[j] + " ");
        }
    }
}
