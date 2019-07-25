package arrays;

/**
 * @author rashmi on 2019-07-01

 */
public class ArrayRotation {

    public static void main(String[] args) {
        ArrayRotation arrayRotation = new ArrayRotation();

        int[] arr = {1,2,3,4,5,6,7};
        int d = 2;
        printArray(arr);
        rotateByOne(arr, d);
        printArray(arr);


        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,11,12};
        d = 3;
        printArray(arr2);
        rotateByJuggling(arr2, d);
        printArray(arr2);

        int[] arr3 = {1,2,3,4,5,6,7};
        d = 2;
        printArray(arr3);
        leftRotateByUsingReversalAlgorithm(arr3, d);
        printArray(arr3);

        int arr4[] = {1, 2, 3, 4, 5};
        printArray(arr4);
        cyclicallyRotateByone(arr4);
        printArray(arr4);

        int[] arr5 = {1,2,3,4,5,6,7};
        d = 2;
        printArray(arr5);
        rightRotateByUsingReversalAlgorithm(arr5, d);
        printArray(arr5);

    }



    private static void cyclicallyRotateByone(int[] a) {
        int temp = a[a.length-1];
        for( int i=a.length-1; i>0; i--) {
            a[i] = a[i-1];
        }
        a[0] = temp;
    }

    private static void leftRotateByUsingReversalAlgorithm(int[] a, int d) {
        reverse(a, 0,d-1);
        reverse(a, d,a.length-1);
        reverse(a, 0, a.length-1);
    }

    private static void rightRotateByUsingReversalAlgorithm(int[] a, int d) {
        reverse(a, 0, a.length-1);
        reverse(a, 0,d-1);
        reverse(a, d,a.length-1);
    }

    private static void reverse(int[] a, int start, int end) {
        int temp;
        while(start<end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start ++;
            end --;
        }
    }

    private static void rotateByJuggling(int[] a, int d) {
        int i, j, k, temp;
        int gcd = gcd(a.length, d);
        for(i=0; i<gcd; i++) {
            temp =a[i];
            j = i;
            while(true) {
                k = j+d;
                if(k>=a.length) {
                    k = k-a.length;
                }
                if( k == i) {
                    break;
                }
                a[j] = a[k];
                j= k;
            }
            a[j] = temp;
        }
    }

    private static int gcd(int a, int b) {
        if( b == 0) {
            return a;
        }
        else
        return gcd(b, a%b);
    }

    private static void rotateByOne(int[] arr, int d) {
        for(int i=0; i<d ; i++) {
            rotateOnce(arr);
        }
    }

    private static void rotateOnce(int[] a) {
        int temp = a[0];
        int i;
        for(i=0; i<a.length-1; i++){
            a[i] = a[i+1];
        }
        a[i] = temp;
    }

    private static void printArray(int[] a) {
        for(int i=0;i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
//        System.out.println("***************");
    }

}
