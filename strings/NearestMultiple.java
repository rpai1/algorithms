package strings;

import java.io.*;
        import java.util.*;

class NearestMultiple{

    private static int getNearestMultiple(int n){

        int a = (n/10) * 10;
        int b = a + 10;

        return n-a <= b-n ? a : b;
    }

    public static void main(String args[]){

        int n = 4722;
        int k = getNearestMultiple(n);
        System.out.println(k);
    }
}



