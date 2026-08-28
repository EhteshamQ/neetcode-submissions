/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        Map<Integer, Node> nodeMap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();

        queue.offer(node);

        while(!queue.isEmpty()) {
            Node top = queue.poll();
            Node clone = new Node(top.val);
            nodeMap.put(top.val, clone);
            for(Node x: top.neighbors) {
                if (!nodeMap.containsKey(x.val))
                   { queue.offer(x);}
            }
        }

        // nodeMap.forEach(n -> System.out.println(n.getValue()));
        queue.offer(node);
        Map<Integer, Boolean> visited = new HashMap<>();
        while(!queue.isEmpty()){
            Node top = queue.poll();
            Node clone = nodeMap.get(top.val);
              if (!visited.containsKey(top.val)) {
                    visited.put(top.val, true);
              }
            for(Node x: top.neighbors) {
                clone.neighbors.add(nodeMap.get(x.val));
                if (!visited.containsKey(x.val)) {
                    visited.put(x.val, true);
                    queue.offer(x);
                }
           
            }
        }

        return nodeMap.get(node.val);

    }
}