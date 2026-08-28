class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1)
            return s.length();


        int l = 0 , r = 0;
        Set<Character> set = new HashSet<>();
        int max = 0;

        while(r < s.length()) {
            while(r < s.length() && set.contains(s.charAt(r))) {
                set.remove(s.charAt(l++));
            }

            set.add(s.charAt(r));
            max = Math.max(max , r- l +1);
            r++;
        }
        return max;
    }
}
