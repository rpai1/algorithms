package strings;

/**
 * @author rashmi on 2019-07-08

 */

class Palindrome{
    private static boolean isPalindrome(String str){
        String reverse = new StringBuffer(str).reverse().toString();
        if(str.compareTo(reverse) == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        String str = "malayalam";
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);

    }
}


