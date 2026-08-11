class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> res=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)>n/3)res.add(key);
        }
        return res;
    }
}