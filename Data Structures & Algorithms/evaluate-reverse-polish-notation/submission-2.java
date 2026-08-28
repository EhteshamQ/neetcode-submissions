class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0)
            return 0;
        if (tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        if (tokens.length == 2)
            return tokens[1].equals("-") ? - Integer.parseInt(tokens[0]) : Integer.parseInt(tokens[0]);

        Stack<Integer> st = new Stack<>();
        int index = 0;
        while(index < tokens.length) {
            switch(tokens[index]) {
                case "+" -> {
                    int n1 = st.pop();
                    int n2 = st.pop();
                    int res = n1 + n2;
                    st.push(res);
                }
                case  "-" -> {int n1 = st.pop();
                    int n2 = st.pop();
                    int res = n2 - n1;
                    st.push(res);
                    }
                case "*" -> {
                    int n1 = st.pop();
                    int n2 = st.pop();
                    int res = n1 * n2;
                    st.push(res);
                    }
                case "/" -> {int n1 = st.pop();
                    int n2 = st.pop();
                    int res = n2 / n1;
                    st.push(res);
                    }
                default -> st.push(Integer.parseInt(tokens[index]));
            }
            index++;
        }
        return st.peek();

    }
}
