class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int n:nums)set.add(n);
        for(int n:set){
            int num=n;
            if(!set.contains(num-1)){
                int n1=num;
                int l=1;
                while(set.contains(n1+1)){
                    n1+=1;
                    l+=1;
                }
                max=Math.max(max,l);
            }
        }
        return max;
    }
}
