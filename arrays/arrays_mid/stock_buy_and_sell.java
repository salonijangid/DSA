package arrays_mid;

public class stock_buy_and_sell {
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};    // max_profit = 6 (sell) - 1 (buy) ; u cannot sell before buying thus 7 - 1 is not the answer
        System.out.println(profit(a));
    }

    //TC -> O(N) ; SC -> O(1)
    static int profit(int[] a){
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0; i<a.length; i++){
            min_price=Math.min(min_price, a[i]);
            max_profit=Math.max(max_profit, a[i] - min_price);
        }
        return max_profit;
    }
}
