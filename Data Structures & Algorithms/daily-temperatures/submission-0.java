class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] res = new int[t.length];
        Stack<Pair> st = new Stack<>();

        for(int i =0; i < t.length; i++) {
            while(!st.isEmpty() && st.peek().val < t[i]) {
                Pair p = st.pop();
                res[p.index] = i - p.index;
            }
            st.push(new Pair(t[i] ,i));
        }

        return res;
        
    }

   static class Pair {
        int val;
        int index;
        public Pair(int v, int i) {
            val = v;
            index = i;
        }
    }
}
