class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
    while(l<r){
        int mid=(l+r)/2;
        if(nums[mid]>nums[r])l=mid+1;
        else r=mid;
    }
    int piv=l;
    int st=0;
     int end=piv-1;
    while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target)end=mid-1;
            else st=mid+1;
        }
        st=piv;
        end=nums.length-1;
         while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target)end=mid-1;
            else st=mid+1;
        }
        return -1;
    }
   
}
