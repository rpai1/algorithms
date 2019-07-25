package strings;

/**
 * @author rashmi on 2019-07-08

 */

class RemovePunctuantions{
    private static String removePunctuations(String str){
        str = str.replaceAll("\\p{Punct}", "");
        return str;
    }

    public static void main(String args[]){

        String str = "Hello!!!, he said ---and went.";
        String result = removePunctuations(str);
        System.out.println(result);
    }
}


