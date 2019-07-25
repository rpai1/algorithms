package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class CheckIfAllRowsOfMatrixAreCircularRotationsOfEachOther {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4},
                {4, 1, 2, 3},
                {3, 4, 1, 2},
                {2, 3, 4, 1}
        };

        checkIfRorattions(mat, mat.length, mat[0].length);
    }

    private static void checkIfRorattions(int[][] mat, int m, int n) {

        String rotationStr = "";

        for(int i=0;i<n;i++){
            rotationStr = rotationStr + mat[0][i];
        }

        rotationStr = rotationStr + rotationStr;

        System.out.println(rotationStr);

        String temp = "";
        boolean flag = true;
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                temp = temp + mat[i][j];
            }
            if(isSubString(temp, rotationStr)){
                temp="";
            }
            else {
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }

    private static boolean isSubString(String sub, String main){
        return main.contains(sub);
    }
}
