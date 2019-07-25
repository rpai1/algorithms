package arrays;

/**
 * @author rashmi on 2019-07-05

 */
public class TwoStacksInAnArray {

    int top1;
    int top2;
    int[] arr;

    public TwoStacksInAnArray(int n){
        top1 = -1;
        top2 = n;
        arr = new int[n];
    }
    public static void main(String[] args) {
        TwoStacksInAnArray ts = new TwoStacksInAnArray(5);
        ts.push1(5);
        ts.push2(10);
        ts.push2(15);
        ts.push1(11);
        ts.push2(7);
        System.out.println("Popped element from" +
                " stack1 is " + ts.pop1());
        ts.push2(40);
        System.out.println("Popped element from" +
                " stack2 is " + ts.pop2());
    }

    private void push1(int i){

        if( top1 <  (top2-1)){
            top1++;
            arr[top1] = i;
        }
        else {
            System.out.println(" stack over flow");
            System.exit(1);
        }
    }

    private void push2(int i){
        if( top1 < (top2-1)) {
            top2 --;
            arr[top2] = i;
        }
        else {
            System.out.println(" stack over flow");
            System.exit(1);
        }
    }

    private int pop1(){
        int ele=-1;
        if( top1 >= 0){
            ele = arr[top1];
            top1--;
        }
        else {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return  ele;
    }

    private int pop2(){
        int ele = -1;
        if( top2 <= arr.length-1){
            ele = arr[top2];
            top2++;
        }
        return  ele;
    }
}
