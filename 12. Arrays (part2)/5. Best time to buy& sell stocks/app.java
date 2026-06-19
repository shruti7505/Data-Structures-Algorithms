public class app {

  public static int buyAndSell(int prices[]){
    int maxProfit = 0;
    int buyPrice = Integer.MAX_VALUE;
    for(int i= 0; i<prices.length ; i++){
      if(buyPrice< prices[i]){ // profit

        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(profit,maxProfit);
      }
      else
      buyPrice = prices[i];
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int prices[] = {7,1,5,3,6,4};
    
    System.out.println("maximum profit is: " +buyAndSell(prices) );
  }
}
