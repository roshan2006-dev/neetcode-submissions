class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arr=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                arr.add(nums1[i]);
                i+=1;
            }else{
                arr.add(nums2[j]);
                j+=1;
            }
        }
        while(i<nums1.length){
            arr.add(nums1[i]);
            i+=1;
        }
        while(j<nums2.length){
            arr.add(nums2[j]);
            j+=1;
        }
        if(arr.size()%2==0){
            return (double)(arr.get(arr.size()/2)+arr.get(arr.size()/2-1))/2;
        }
        return (double)(arr.get(arr.size()/2));
    }
}
