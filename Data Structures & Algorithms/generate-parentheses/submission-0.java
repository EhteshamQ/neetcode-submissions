class Solution {
    public List<String> generateParenthesis(int n) {
        int openCount = 0, closedCount = 0;
        List<String> res = new LinkedList<>();
        Stack<Character> st = new Stack<>();
        backtrack(n , openCount, closedCount, st, res);
        return res;

    }

    public String generateStackString(Stack<Character> st) {
        String s = "";
        for(char c: st) {
            s+= c;
        }
        return s;
    }

    public void backtrack(int n, int openCount, int closedCount, Stack<Character> st, List<String> res) {
        if (openCount == n && closedCount == n){
            res.add(generateStackString(st));
            return;
        } 
        if (openCount < n) {
            st.push('(');
            backtrack(n, openCount+1, closedCount, st, res);
            st.pop();
        }
        if (closedCount < openCount) {
            st.push(')');
            backtrack(n, openCount, closedCount+1, st, res);
            st.pop();
        }
    }
}
