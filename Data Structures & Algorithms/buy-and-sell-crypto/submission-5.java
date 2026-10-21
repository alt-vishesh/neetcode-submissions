class Solution {
    public int maxProfit(int[] prices) {
        int x=prices[0];
        
        int pr=0;
        for(int i=1;i<prices.length;i++){
            
            if(prices[i]-x>pr){
                pr=prices[i]-x;
            }
            if(prices[i]<x){
                x=prices[i];
            }
            
        }
        return pr;
    }
}
