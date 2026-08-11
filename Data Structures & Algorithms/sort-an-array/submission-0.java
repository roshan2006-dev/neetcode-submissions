class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int n:nums)queue.add(n);
    int[] res=new int[nums.length];
    int i=0;
    while(!queue.isEmpty()){
        res[i++]=queue.poll();
    }
    return res;
    }

}