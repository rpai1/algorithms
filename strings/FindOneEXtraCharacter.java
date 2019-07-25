package strings;

/**
 * @author rashmi on 2019-07-08

 */

class FindOneEXtraCharacter{

    private static int findOneExtraCharacter(String str1, String str2){

        int res=0;

        for(int i=0;i<str1.length(); i++){
            res = res ^ str1.charAt(i);
        }

        for(int i=0;i<str2.length();i++){
            res = res ^ str2.charAt(i);
        }

        return res;

    }

    public static void main(String args[]){

        String str1 = "abcd";
        String str2 = "abcde";

        int res = findOneExtraCharacter(str1, str2);
        System.out.println((char)res);
    }
}


