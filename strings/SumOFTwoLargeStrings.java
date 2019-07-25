package strings;

/**
 * @author rashmi on 2019-07-09

 */
import java.io.*;
        import java.util.*;

class SumOFTwoLargeStrings{
    private static String findSum(String str1, String str2){

        StringBuilder str3= new StringBuilder();

        char[] ch1 = str1.toCharArray();
        char[] ch2= str2.toCharArray();

        int m = ch1.length;
        int n = ch2.length;
        int diff = Math.abs(m-n);
        Integer sum=0;
        int carry=0;

        for(int i= Math.min(m, n)-1; i>=0; i--){
            sum = Character.getNumericValue(ch1[i]) + Character.getNumericValue(ch2[i+diff]) + carry;
            if(sum > 10){
                carry = sum/10;
                sum = sum%10;
            }
            str3.append(sum);
        }

        if(m > n){
            for(int i=m-n-1; i>=0; i-- ){
                if(carry !=0){
                    int total = Character.getNumericValue(ch1[i]) + carry;
                    str3.append(total);
                    carry =0;
                }
                else{
                    str3.append(ch1[i]);
                }
            }
        }
        if( n > m){
            for(int i=n-m-1; i>=0; i-- ){
                if(carry !=0){
                    int total = Character.getNumericValue(ch2[i]) + carry;
                    str3.append(total);
                    carry =0;
                }
                else{
                    str3.append(ch2[i]);
                }
            }
        }


        return str3.reverse().toString();
    }


    public static void main(String args[]){
        String str1 = "44422222221111";
        String str2 = "3333311111111111";
        System.out.println(findSum(str1, str2));
    }
}


