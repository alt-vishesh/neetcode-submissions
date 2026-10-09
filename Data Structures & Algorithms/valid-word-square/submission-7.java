class Solution {
    public boolean validWordSquare(List<String> words) {
    boolean x=true;
    String[] arr=words.toArray(new String[0]);
    for(int i=0;i<arr.length;i++){
        String temp="";
      for(int j=0;j<arr.length && i<arr[j].length();j++){

            temp+=arr[j].charAt(i);
       }
        if(!temp.equals(arr[i])){
            x=false;
        }
    }
    return x;  
    }
}
