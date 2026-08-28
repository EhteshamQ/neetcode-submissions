class Solution {
final String EMPTY_CONSTANT = "/ETY/";
final String SPLIT_CONSTANT = "%%SPLIT%%";
    public String encode(List<String> strs) {
        
        if (strs.size() == 0)
            return "";


        StringBuilder sb = new StringBuilder();

        for(String s: strs) {
            String transformed = s.equals("") ? EMPTY_CONSTANT : s;
            sb.append(transformed + SPLIT_CONSTANT);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.equals("")) {
            return Collections.emptyList();
        }
        String[] allStrs = str.split(SPLIT_CONSTANT);
        List<String> result = new LinkedList<>();
        for(String s: allStrs){
            if(s.equals(EMPTY_CONSTANT))
                result.add("");
            else
                result.add(s);
        }
        return result;
    }
}
