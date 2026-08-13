class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        StringBuilder st=new StringBuilder();
        int l=0;
        for(int i=0;i<s2.length();i++){
            while(i-l+1>n){
                st.deleteCharAt(0);
                l++;
            }
            st.append(s2.charAt(i));
            if(i-l+1==n){
                if(perm(st.toString(),s1))return true;
}
            }
return false;
        }
    
    public boolean perm(String s1,String s2){
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }}
