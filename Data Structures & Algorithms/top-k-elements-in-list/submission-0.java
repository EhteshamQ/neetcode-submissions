class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 1)
            return new int[]{nums[0]};
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i < nums.length; i++){
            if(map.containsKey(nums[i])) {
                map.put(nums[i] , map.get(nums[i]) +1 );
            }
            else {
                map.put(nums[i], 1);
            }
        }
        Queue<Pair> pQueue = new PriorityQueue<>((p , q) -> -1 *  Integer.compare(p.getValue() , q.getValue()));
        map.forEach((key, val) -> {
            Pair p = new Pair(key, val);
            System.out.println(key + " " + val);
            pQueue.add(p);
        });
    
        int[] res = new int[k];
        for(int i = 0 ; i < k; i++){
            res[i] = pQueue.poll().getKey();
        }
        return res;
    }
    
    static class Pair{
        int key;
        int value;

        Pair(int k , int v) {
            key = k;
            value = v;
        }

        int getKey() {
            return key;
        }
        int getValue() {
            return value;
        }
    }
}


