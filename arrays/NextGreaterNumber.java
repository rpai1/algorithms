package arrays;

/**
 * @author rashmi on 2019-07-11

 */
import java.io.*;
        import java.util.*;

class NextGreaterNumber{

    private static void findNextGraterNumber(int[] a, int n){

        int p=-1, q=-1;
        for(int i=n-2; i>=0;i--){
            if(a[i+1] > a[i] ){
                p=i;
                break;
            }
        }

        if(p==-1){
            return;
        }
        for(int i=n-1; i>=0;i--){
            if(a[i] > a[p]){
                q= i;
                break;
            }
        }
        System.out.println(p + " "+q);

        int temp = a[p];
        a[p] = a[q];
        a[q] =temp;

        reverse(a, p+1,n-1);

        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }

    private static void reverse(int[] a, int start, int end){

        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        int[] num = {4 ,5 ,6 ,3, 2 ,1 };
        findNextGraterNumber(num, num.length);
    }
}


