package Array;

import java.util.Scanner;

public class BestTimeToBuySellStock {
    static int maxProfit(int[] prices){
        int buy = prices[0];
        int profit = 0;

        for(int i = 1; i < prices.length; i++){
            if(buy > prices[i]){
                buy = prices[i];
            }else if( profit < (prices[i] - buy)){
                profit = prices[i] - buy;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter price of stock each day");
        for(int  i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum profit " + maxProfit(arr));
    }
}
