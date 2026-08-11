class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums)set.add(n);
        if(set.size()==1)return 1;
       List<Integer> arr=new ArrayList<>(set);
       Collections.sort(arr);
       int max=0;
       int count=1;
       for(int i=0;i<arr.size()-1;i++){
        if((arr.get(i))+1==arr.get(i+1))count+=1;
        else count=1;
        max=Math.max(max,count);
       }
       return max;
    }
}
