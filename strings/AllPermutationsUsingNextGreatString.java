package strings;

/**
 * @author rashmi on 2019-07-11

 */
import java.io.*;
        import java.util.*;

class AllPermutationsUsingNextGreatString{

    private static String getNextPermutation(char[] str, int n){
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = (str[i] - 'a');
        }

        int p=-1, q=-1;
        for(int i=n-2; i>=0;i--){
            if(a[i+1] > a[i] ){
                p=i;
                break;
            }
        }

        if(p==-1){
            Arrays.sort(str);
            return new String(str);
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

        char[] res = new char[n];

        for(int i=0;i<n;i++){
            res[i] = (char)(a[i]+ 'a');
        }
        return new String(res);
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

    private static int  getfactorial( int n){
        int fact = 1;
        for(int i=2; i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }

    public static void main(String[] args)
    {

        String str = "BAC";
        int allPermutations = getfactorial(str.length());

        HashSet<String> distinctPermutations = new HashSet<String>();
        distinctPermutations.add(str);
        String permutation = str;
        for(int i=0;i<allPermutations; i++){
            permutation = getNextPermutation(permutation.toCharArray(), str.length());
            distinctPermutations.add(permutation);
        }

        System.out.println(distinctPermutations);
    }
}


