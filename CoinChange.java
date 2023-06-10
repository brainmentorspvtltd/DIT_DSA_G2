package Recursion;

public class CoinChange {

    static void coinChange(int cost[], int amount, int index) {
        if(amount == 0) {
            return;
        }
        for(int i = index; i < cost.length; i++) {
            if(amount >= cost[i]) {
                coinChange(cost, amount - cost[i], i);
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
