class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n = t.length;
        int[] res = new int[n];
        Arrays.fill(res,0);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                int top=st.pop();
                res[top]=i-top;
            }
            st.push(i);
        }
        return res;
    }
}
