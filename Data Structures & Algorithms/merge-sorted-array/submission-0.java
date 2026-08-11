class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                arr.add(nums1[i]);
                i++;
            }else{
                arr.add(nums2[j]);
                j++;
            }
        }
        while(i<m){
            arr.add(nums1[i]);
            i++;
        }
        while(j<n){
            arr.add(nums2[j]);
            j++;
        }
        for(i=0;i<nums1.length;i++){
        nums1[i]=arr.get(i);
        }
    }
}