package strings;

import java.io.*;
import java.util.*;

class LetterFreq {

    int count;
    char letter;

    LetterFreq(int c, char l){
        count = c;
        letter = l;
    }
}
class ReArrangeToavoidAdjescentSameCharacters{

    private static String reOrganize(String str){

        int[] chars = new int[26];
        for(char c : str.toCharArray()){
            chars[c-'a']++;
        }


        PriorityQueue<LetterFreq> pq = new PriorityQueue<LetterFreq>(new Comparator<LetterFreq>(){
            @Override
            public int compare(LetterFreq k1, LetterFreq k2) {
//                if (k1.count < k2.count)
//                    return 1;
//                else if (k1.count > k2.count)
//                    return -1;
//                return 0;
                return k1.count > k2.count ? 1: 0;
            }
        });

        for(int i=0;i<chars.length; i++){
            if(chars[i] > 0){
                if(chars[i] > str.length()/2){
                    return "";
                }
                pq.add(new LetterFreq( chars[i], (char)(i+ 'a')));
            }
        }


        StringBuilder ans = new StringBuilder();
        while(pq.size() > 1){
            // System.out.println("here");
            LetterFreq first = pq.poll();
            LetterFreq sec = pq.poll();

            ans.append(first.letter);
            ans.append(sec.letter);

            if(first.count >1){
                first.count --;
                pq.add(first);
            }

            if(sec.count >1){
                sec.count --;
                pq.add(sec);
            }

        }
        if(!pq.isEmpty()){
            if(pq.size() == 1){
                ans = ans.append(pq.poll());
            }
        }
        return ans.toString();
    }

    public static void main(String args[]){
        String s = "aaabbc";
        String res = reOrganize(s);
        System.out.println(res);
    }
}


