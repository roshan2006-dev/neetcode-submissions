class Solution {
    public int calPoints(String[] op) {
       Stack<Integer> st=new Stack<>();
       for(String s:op){
        if(s.equals("+")){
           int num1=st.pop();
           int num2=st.pop();
           int res=num1+num2;
           st.push(num2);
           st.push(num1);
           st.push(res);
            }else if(s.equals("D")){
                int top=st.peek();
                st.push(top*2);
            }else if(s.equals("C")){
                st.pop();
            }else st.push(Integer.parseInt(s));
        }
        int sum=0;
        while(!st.isEmpty())sum+=st.pop();
        return sum;
       } 
    }
