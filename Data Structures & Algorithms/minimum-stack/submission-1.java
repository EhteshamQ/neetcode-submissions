class MinStack {

    List<Integer> items;
    List<Integer> min;

    public MinStack() {
        items = new LinkedList<>();
        min = new LinkedList<>();    
    }
    
    public void push(int val) {
        items.add(0 , val);
        if (min.isEmpty() || min.get(0) >= val) {
            min.add(0, val);
        }
    }
    
    public void pop() {
        int val = items.remove(0);
        if (!min.isEmpty() && min.get(0) == val)
            min.remove(0);
    }
    
    public int top() {
        return items.get(0);
    }
    
    public int getMin() {
        return min.get(0);
    }
}
