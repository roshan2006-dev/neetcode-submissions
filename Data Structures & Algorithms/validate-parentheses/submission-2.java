class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        if(s.length()<=1)return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            st.push(s.charAt(i));
            else{
                if(st.isEmpty())return false;
                int top=st.pop();
                if(s.charAt(i)==']' && top!='[')return false;
                else if(s.charAt(i)==')' && top!='(')return false;
                else if(s.charAt(i)=='}' && top!='{')return false;
                            }
        }
        return st.isEmpty();
    }
}
