class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
           if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1;j<nums.length-2;j++){
           if(j>i+1 && nums[j]==nums[j-1])continue;
           int a=j+1;
           int b=nums.length-1;
           while(a<b){
            long sum=(long)nums[i]+nums[j]+nums[a]+nums[b];
            if(sum==target){
                res.add(Arrays.asList(nums[i],nums[j],nums[a],nums[b]));
                while(a<b && nums[a]==nums[a+1])a+=1;
                while(a<b && nums[b]==nums[b-1])b-=1;
                a+=1;
                b-=1;
            }else if(sum<target)a+=1;
            else b-=1;
           }
            }
        }
          return res;
    }
}