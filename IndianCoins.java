import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder());

        int countCoins = 0;
        int amt = 550;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i < coins.length; i++) {
            if(coins[i] <= amt) {
                while (coins[i] <= amt) {
                    countCoins++;
                    ans.add(coins[i]);
                    amt -= coins[i];
                }
            }
        }
        System.out.println(countCoins);

        for(int i=0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
