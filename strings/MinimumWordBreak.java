package strings;

/**
 * @author rashmi on 2019-07-18

 */

//TODO: Check this Rashmi
class MinimumWordBreak {

    private static int getMinimumWordBreak(String str, int i, int j, int min, String[] keys) {

        if (isWordPresent(str, i, j, keys)) {
            return 1;
        }
        if( i==j){
            return 0;
        }

        for (int k = i; k < j; k++) {
             min = Math.min(min, getMinimumWordBreak(str, i, k, min, keys) +
                    getMinimumWordBreak(str, k + 1, j, min, keys)+1);

             System.out.println("Number of partitions is: min is:" +min + " ");
        }

        return min;
    }

    private static boolean isWordPresent(String str, int i, int j, String[] keys) {

        String required = str.substring(i, j);
        for (String s : keys) {
            if (s.equalsIgnoreCase(required)) {
                System.out.println("required is:" + required + " " + i + " " + j + " " + s);
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String str = "catmat";
        String keys[] = {"cat", "mat", "ca", "ma",
                "at", "c", "dog", "og", "do"};
        int pos = getMinimumWordBreak(str, 0, str.length(), 10000, keys);
        System.out.println(pos);
    }
}
