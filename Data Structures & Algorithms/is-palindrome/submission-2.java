class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        String k = s.toLowerCase();
        while(l < r) {
            
            if (!Character.isLetterOrDigit(s.charAt(l)))
            {
                while(l < s.length()-1  && !Character.isLetterOrDigit(k.charAt(l)))
                    l++;
            }
            if (!Character.isLetterOrDigit(k.charAt(r)))
            {
                while(r >= 0 && !Character.isLetterOrDigit(k.charAt(r)))
                    r--;
            }

            if (l < k.length() && r >=  0 && k.charAt(l) != k.charAt(r))
                return false;
            else {
                l++;
                r--;
            }
        }
        return true;
    }
}
