class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                st.push((st.get(st.size()-1))+(st.get(st.size()-2)));
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                st.push(2*(st.get(st.size()-1)));
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int s=0;
        while(!st.isEmpty()){
            s+=st.pop();
            
        }
        return s;
    }
}