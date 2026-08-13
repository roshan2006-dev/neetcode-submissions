class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
     rotate(nums,0,nums.length-1);
      rotate(nums,0,k-1);
      rotate(nums,k,nums.length-1);
    
    }
    public void rotate(int[] arr,int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
        st+=1;
        end-=1;
        }
    }
}