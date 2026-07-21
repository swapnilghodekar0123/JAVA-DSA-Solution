class BestTimeToByeAndSell {
    public int maxProfit(int[] prices) {
        int max = 0;
        int bestBye = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i] < bestBye){
                bestBye = prices[i];
            }
            max = Math.max(max, prices[i]-bestBye);
        }
        return max;
    }
}