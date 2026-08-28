class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new LinkedList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(map.containsKey(sorted)){
                map.get(sorted).add(s);
            }
            else{
                List<String> li = new LinkedList<>();
                li.add(s);
                map.put(sorted , li);
            }
        }
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            res.add(entry.getValue());
        }
        return res;        
    }
}
