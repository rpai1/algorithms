package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author rashmi on 2019-07-05

 */
public class FindDistinctElementsCommonToAllRows {

    public static void main(String[] args) {

        int mat[][] = {  {2, 1, 4, 3},
                {1, 2, 3, 2},
                {3, 6, 2, 3},
                {5, 2, 5, 3}  };

        findDistinctElementscommon(mat, mat.length, mat[0].length);
    }

    private static void findDistinctElementscommon(int[][] mat, int m, int n) {

        HashMap<Integer, Integer> hashSet = new HashMap<>();
        for(int i=0;i<n;i++){
            hashSet.put(mat[0][i], 1);
        }


        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                if(hashSet.containsKey(mat[i][j])){
                    hashSet.put(mat[i][j], hashSet.get(mat[i][j])+1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> e : hashSet.entrySet()) {
            if(e.getValue() == m+1) {
                System.out.println(e.getKey());
            }
        }

        System.out.println(hashSet);
    }


}
