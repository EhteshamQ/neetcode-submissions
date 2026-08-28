class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freqMap = new HashMap<>();
        int left =0,  right = 0;
        int maxFreq = 0;
        int res = 0;
        while(right < s.length()) {
            int freq = 0;
            if (freqMap.containsKey(s.charAt(right))) {
                freqMap.put(s.charAt(right) , freqMap.get(s.charAt(right)) + 1);
                freq = freqMap.get(s.charAt(right));
            }
            else {
                freqMap.put(s.charAt(right) , 1);
                freq = 1;
            }
            maxFreq = Math.max(freq, maxFreq);
            while(right - left +1 - maxFreq > k)
            {
                freqMap.put(s.charAt(left) , freqMap.get(s.charAt(left))-1);        
                    left++;
}
            System.out.println("right= " + right + "left = " + left);
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;
    }
}
