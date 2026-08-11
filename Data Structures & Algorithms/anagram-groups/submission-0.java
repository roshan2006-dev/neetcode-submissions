class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                List<String> rr=new ArrayList<>();
                rr.add(s);
                map.put(key,rr);
            }
        }
        return new ArrayList<>(map.values());
    }
}
