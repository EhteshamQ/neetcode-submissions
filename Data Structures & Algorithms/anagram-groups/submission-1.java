class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
            return List.of(List.of(strs[0]));
        }
        List<List<String>> result = new LinkedList<>();
        Map<String, List<String>> aMap = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            char[] chArr = strs[i].toCharArray();
            Arrays.sort(chArr);
            String sortedString = new String(chArr);
            if (aMap.containsKey(sortedString)){
                aMap.get(sortedString).add(strs[i]);
            }
            else {
                List<String> li = new LinkedList<>();
                li.add(strs[i]);
                aMap.put(sortedString, li);
                result.add(li);
            }
        }
        return result;

    }
}
