package dynamicprogramming;

/**
 * @author rashmi on 2019-07-22

 */
public class FriendPairingProblem {
    public static void main(String[] args) {
        int n= 3;
        int friebds = findFriend(n);
        System.out.println(friebds);
    }

    private static int findFriend(int n) {
        int[] dp = new int[n+1];

        for(int i=0; i<=n;i++){
            if(i<=2){
                dp[i] = i;
            }
            else {
                dp[i] = dp[i-1] + (i-1)*dp[i-2];
            }
        }
        return dp [n];
    }
}
