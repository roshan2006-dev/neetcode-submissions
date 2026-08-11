class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            if(n>0)
            set.add(n);
        }
        int ans=0;
        List<Integer> res=new ArrayList<>(set);
     Collections.sort(res);
      for(int i=0;i<res.size()-1;i++){
        if(res.get(i)>0){
            if(res.get(i)+1!=res.get(i+1)){
                ans=res.get(i)+1;
                break;
            }
        }
      } 
    if(res.isEmpty() || res.get(0)>1 && ans>1 )return 1;
     if(ans==0){
        if(res.get(0)>1)return 1;
        else return res.get(res.size()-1)+1;
     }
    return ans;
    }
}