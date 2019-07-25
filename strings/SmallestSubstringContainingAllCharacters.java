package strings;

/**
 * @author rashmi on 2019-07-09

 */

class SmallestSubstringContainingAllCharacters{
    private static String findSubString(String str, String pats){

        char[] stch = str.toCharArray();
        char[] pat = pats.toCharArray();
        int m = stch.length;
        int n = pat.length;
        if( n> m){
            return " Not possible";
        }
        if( n==0 || m == 0){
            return "not possible";
        }

        char[] countStr = new char[256];
        char[] countPat = new char[256];

        for(int i=0;i<n;i++){
            countPat[pat[i]]++;
        }

        int start = 0, startIndex = -1, minLen = Integer.MAX_VALUE;
        int count =0;
        for(int i=0;i<m;i++){
            countStr[stch[i]]++;

            //means count is not zero and we have seen a word at lest once in the string from
            //pattern. say pattern is "that" -> in this case t is present twice
            // we are happy to increase the count even if we see thi once.
            if(countStr[stch[i]]!=0 && countStr[stch[i]] <= countPat[stch[i]]){
                count++;
            }

            if(count == n){
                while ( countStr[stch[start]] > countStr[stch[start]]
                        || countStr[stch[start]] == 0)
                {

                    if (countStr[stch[start]] > countStr[stch[start]])
                        countStr[stch[start]]--;
                    start++;
                }

                int lengthWindow = i-start+1;
                if(lengthWindow < minLen){
                    minLen = lengthWindow;
                    startIndex = start;
                }
            }

        }

        return str.substring(startIndex, startIndex+minLen);

    }

    public static void main(String[] args)
    {
        String str = "this is a test string";
        String pat = "tist";

        System.out.print("Smallest window is :\n " +
                findSubString(str, pat));
    }
}


