class Solution {
    public void sortColors(int[] nums) {
      int i=0;
      for(int j=0;j<nums.length;j++){
        if(nums[j]==0){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
        i++;
        }
      }
      i=nums.length-1;
      for(int j=nums.length-1;j>=0;j--){
        if(nums[j]==2){
            int temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
            i-=1;
        }
      }
      
    }
}