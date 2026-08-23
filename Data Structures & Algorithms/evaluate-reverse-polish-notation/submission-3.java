class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                int one=st.pop();
                int two=st.pop();
                st.push(one+two);
            }else if(s.equals("*")){
                int o=st.pop();
                int t=st.pop();
                st.push(o*t);
            }else if(s.equals("/")){
                 int o=st.pop();
                int t=st.pop();
               st.push(t/o);
            }else if(s.equals("-")){
                 int o=st.pop();
                int t=st.pop();
                st.push(t-o);
            }else st.push(Integer.parseInt(s));
        }
        return st.peek();
    }
}
