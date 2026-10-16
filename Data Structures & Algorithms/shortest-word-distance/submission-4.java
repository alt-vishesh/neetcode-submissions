class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int x=-1;
        int y=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<wordsDict.length;i++){
            if(wordsDict[i].equals(word1)){
                x=i;
            }
            else if(wordsDict[i].equals(word2)){
                y=i;
            }
            if(x!=-1 && y!=-1){
                if(Math.abs(x-y)<min){
                    min=Math.abs(x-y);
                }
            }

        }
        return min;
    }
}
