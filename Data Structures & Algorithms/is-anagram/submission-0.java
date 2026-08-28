class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        // n log n approach using sorting
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int i = 0;
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        while(i < sArr.length){
            if(sArr[i] != tArr[i])
                return false;
                i++;
        }
        return true;
    }
}
