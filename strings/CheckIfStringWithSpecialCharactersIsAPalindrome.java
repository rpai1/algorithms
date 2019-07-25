package strings;

/**
 * @author rashmi on 2019-07-25

 */
public class CheckIfStringWithSpecialCharactersIsAPalindrome {
    public static void main(String[] args) {
        String str = "m a 343 la y a l am";

        if(isPalindrome(str))
            System.out.print("YES");
        else
            System.out.println("NO");
    }

    private static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length()-1;

        while(start<end){
            if(Character.isAlphabetic(str.charAt(start)) && Character.isAlphabetic(str.charAt(end)) &&
              str.charAt(start) == str.charAt(end) ){
                start++;
                end--;
            }
            else if(Character.isAlphabetic(str.charAt(start)) && Character.isAlphabetic(str.charAt(end)) &&
                    str.charAt(start) != str.charAt(end) ){
               return false;
            }
            if(!Character.isAlphabetic(str.charAt(start))){
              start++;
            }
            if(!Character.isAlphabetic(str.charAt(end))){
                end--;
            }
        }
        return true;
    }
}
