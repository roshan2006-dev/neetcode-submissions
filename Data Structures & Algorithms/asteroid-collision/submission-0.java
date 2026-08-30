class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st=new Stack<>();
       
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && st.peek()>0 && a[i]<0){
             int diff=a[i]+st.peek();
             if(diff<0){
                st.pop();
             }else if(diff>0)a[i]=0;
             else {
                a[i]=0;
                st.pop();
             }
                
            }if(a[i]!=0)
               st.push(a[i]);
        }
        int[] res=new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            res[i--]=st.pop();
        }
        return res;
    }
}