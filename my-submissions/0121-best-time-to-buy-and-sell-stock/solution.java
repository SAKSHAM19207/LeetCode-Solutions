import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int profit=prices[i]-min;
            if(profit>maxprofit){
            maxprofit=profit;
            }
        }
        return maxprofit;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Solution s=new Solution();
        int n=sc.nextInt();
        int[] prices=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        int k=s.maxProfit(prices);
        System.out.print(k);
    }
}
