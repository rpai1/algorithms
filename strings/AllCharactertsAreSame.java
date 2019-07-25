package strings;

/**
 * @author rashmi on 2019-07-08

 */

class AllCharactertsAreSame{

    public static void main(String args[]){
        String s = "aaa";
        int i;
        for(i=0;i<s.length(); i++){
            if(s.charAt(i) == s.charAt(0)){
                continue;
            }
            else {
                System.out.println("false");
            }
        }

        if(i== s.length()){
            System.out.println("true");
        }

    }
}



