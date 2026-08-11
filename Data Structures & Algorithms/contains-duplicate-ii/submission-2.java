class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashSet<Integer> set=new HashSet<>();
       int l=0;
       for(int r=0;r<nums.length;r++){
      if(set.contains(nums[r]))return true;
        set.add(nums[r]);
          while(r-l+1>k){
            set.remove(nums[l]);
            l+=1;
        }
       }
       return false;
    }
}