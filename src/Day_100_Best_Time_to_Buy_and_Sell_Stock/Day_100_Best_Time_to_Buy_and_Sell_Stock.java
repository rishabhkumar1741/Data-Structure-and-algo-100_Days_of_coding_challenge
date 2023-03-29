package Day_100_Best_Time_to_Buy_and_Sell_Stock;

class Solution {
    public int maxProfit(int[] prices) {
        // check for null 
        if(prices.length==1||prices.length==0|| prices == null)
        {
            return 0;
        }
        else{
            int maxprofit=0;
            int presentprofit=0;
            int lowprice = Integer.MAX_VALUE;
            for(int i=0;i<prices.length;i++)
            {
                if(lowprice>prices[i])
                {
                    lowprice=prices[i];
                }
                presentprofit = prices[i]-lowprice;
                if(presentprofit>maxprofit)
                {
                    maxprofit = presentprofit;
                }
            }
            return maxprofit;
        }
    }
}

public class Day_100_Best_Time_to_Buy_and_Sell_Stock {
    
}
