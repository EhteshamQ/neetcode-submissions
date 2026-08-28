class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char ch[] = s.toCharArray();
        for(char c: ch) {
            
            if (c == '{' || c == '(' || c == '[')
                st.push(c);
            else {
                if (st.isEmpty())
                    return false;
                char top = st.pop();
                if (top == '{' && c == '}' || top == '(' && c == ')' || top == '[' && c == ']')
                    continue;
                else 
                    return false;

            }

        }

    return st.isEmpty();

    }
}
