class Solution {
    public int findJudge(int n, int[][] trust) {
        // Map<Integer, Integer> trustMap = new HashMap<>();

        // for(int i = 0; i < trust.length; i++) {
        //     trustMap.put(trust[i][0] , trust[i][1]);
        // }

        int res = trust[0][1];

        for(int i = 1; i < trust.length; i++) {
            if (res != trust[i][1] || trust[i][0] == res)
                return -1;
        }

        return res;

    }
}