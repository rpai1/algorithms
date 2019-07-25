package arrays;

/**
 * @author rashmi on 2019-07-04

 */
public class MajorityElementMooresVotingAlgorithm {
    public static void main(String[] args) {
        int[] a= {3, 3, 4, 2, 4, 4, 2, 4, 4};

        int majorityElement = findMajorityElement(a, a.length);
        System.out.println(majorityElement);
    }

    private static int findMajorityElement(int[] a, int n) {

        int majIndex = 0;
        int count =1;

        for(int i=0;i<n;i++){
            if(a[i] == a[majIndex]){
                count++;
            }
            else {
                count--;
            }
            if(count == 0){
                majIndex = i;
                count=1;
            }
        }

        int majority = a[majIndex];

        int occurMoreThanNBy2TimesCount = 0;
        for(int i=0; i<n; i++){
            if(a[i] == majority){
                occurMoreThanNBy2TimesCount ++;
            }
        }

        if(occurMoreThanNBy2TimesCount > n/2){
            return majority;
        }
        return -1;
    }
}
