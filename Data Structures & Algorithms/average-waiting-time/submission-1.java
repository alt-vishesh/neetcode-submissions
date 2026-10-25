class Solution {
    public double averageWaitingTime(int[][] customers) {
        long sum=0;
        long m=0;
        for(int i=0;i<customers.length;i++){
            long l=0;
            if(i==0){
                m=m+customers[i][1]+customers[i][0];
                l=m-customers[i][0];                    
            }
            else{
                m=Math.max(m, customers[i][0]) + customers[i][1];
                l=m-customers[i][0];
            }
        sum=sum+l;
        }
        double f=(sum)/((double)(customers.length));
        return f;
    }
}