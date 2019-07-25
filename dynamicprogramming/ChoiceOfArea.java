package dynamicprogramming;

/**
 * @author rashmi on 2019-07-22

 */
class area {
    int a;
    int b;

    public area(int x, int y){
        a=x;
        b=y;
    }
}
public class ChoiceOfArea {
    public static void main(String[] args) {
      area x = new area(3,2);
      area y = new area(-5, -10);
      area z = new area(-20, 5);
      int A = 20;
      int B = 8;

      int l = getMaxSurvivalTime(A, B, x, y,z);
        System.out.println(l);
    }

    private static int getMaxSurvivalTime(int a, int b, area x, area y, area z) {
        if(a<=0 || b<=0){
            return 0;
        }

        int max = 0;
        int count =0;

        area previouslyChosen = null;
        int xChosen=0, yChosen=0,zChosen=0;
        while(a >=0 && b >= 0){

            if(previouslyChosen != x){
                xChosen = x.a+x.b+a+b;
            }
            if( previouslyChosen != y){
                yChosen = y.a+y.b+a+b;

            }
            if(previouslyChosen != z) {
                zChosen = z.a+z.b+a+b;
            }

           max = Math.max(Math.max(xChosen, yChosen), zChosen);
           if(max == xChosen){
               previouslyChosen = x;
           }
           else if(max == yChosen){
               previouslyChosen = y;
           }
           else {
               previouslyChosen = z;
           }
           a = a+previouslyChosen.a;
           b = b+previouslyChosen.b;

           count ++;

           xChosen=0; yChosen=0;zChosen=0;
        }

        // count + 1 because after last step, it reduces the value.. while condition fails when one of them become negative..
        // so need add that to the count.
        return count+1;
    }
}
