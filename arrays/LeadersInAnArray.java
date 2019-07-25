package arrays;

/**
 * @author rashmi on 2019-07-04

 */
/*
An element is leader if it is greater than all the elements to its right side.
And the rightmost element is always a leader. For example int the
 */
public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] a= {16, 17, 4, 3, 5, 2};

        findLeaders(a, a.length);
    }

    private static void findLeaders(int[] a, int n) {

        int maxFromRight = a[n-1];

        System.out.println(maxFromRight);

        for(int i=n-2; i>=0;i--){
            if(a[i] > maxFromRight){
                maxFromRight = a[i];
                System.out.println(maxFromRight);
            }
        }
    }
}
