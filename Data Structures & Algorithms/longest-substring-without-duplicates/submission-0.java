class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        Set<Character> set=new HashSet<>();
        int maxLen = 0;
        for(int i = 0; i < s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l+=1;
            }
            set.add(s.charAt(i));
            maxLen=Math.max(maxLen,i-l+1);
        }
        return maxLen;
    }
}
