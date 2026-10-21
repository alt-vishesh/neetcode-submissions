class Solution {
    public int maxProfit(int[] prices) {
        int x=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            int r=0;
            for(int j=i;j<prices.length;j++){
                if(prices[j]-prices[i] > r){
                    r=prices[j]-prices[i];
                }
            }
            if(r>x){
                x=r;
            }
        }
        return x;
    }
}
