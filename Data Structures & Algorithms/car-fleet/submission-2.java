class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st = new Stack<>();
        int right = position.length-1;
        Pair[] pairs = new Pair[position.length]; 
        for(int i = 0; i < position.length; i++) {
            pairs[i] = new Pair(position[i] , speed[i]);
        }
        Arrays.sort(pairs, (a , b) -> a.p - b.p);
        while(right >= 0) {
            Pair p = pairs[right--];
            double time = (target - p.p) / (p.s * 1.0);
            System.out.println(time);
            if (!st.isEmpty() && time <= st.peek())
            continue;
            st.push(time);
            System.out.println(st);
        } 

        return st.size();
    
    }

static class Pair {
    int p;
    int s;

    public Pair(int pos, int speed) {
        p = pos;
        s = speed;
    } 

    public String toString() {
        return "pos = " + this.p + " speed = " + this.s;
    }
}

}


