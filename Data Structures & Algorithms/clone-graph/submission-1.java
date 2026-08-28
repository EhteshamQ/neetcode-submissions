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

        Map<Node, Node> nodeMap = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        nodeMap.put(node, new Node(node.val));

        queue.offer(node);

        while(!queue.isEmpty()) {
            Node top = queue.poll();
            Node clone = nodeMap.get(top);

            for(Node x: top.neighbors) {
                if (!nodeMap.containsKey(x))
                {
                    nodeMap.put(x , new Node(x.val));
                    queue.offer(x);
                }
                clone.neighbors.add(nodeMap.get(x));
                
            }
        }

        return nodeMap.get(node);
    }
}