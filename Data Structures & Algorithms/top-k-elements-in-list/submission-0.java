class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        } 
        Queue<Map.Entry<Integer,Integer>> q=new PriorityQueue<>((a,b)->{
            if(a.getValue().equals(b.getValue()))return a.getKey()-b.getKey();
            return b.getValue()-a.getValue();
        });
        for(Map.Entry<Integer,Integer> ma:map.entrySet()){
              q.offer(ma);
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=q.poll().getKey();
        }
        return res;
    }
}
