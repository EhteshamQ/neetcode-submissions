class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();

        if (numRows == 0)
            return result;
        
        result.add(List.of(1));
        if (numRows == 1)
            return result;
        
        for(int i = 1; i < numRows; i++) {
            List<Integer> res = new LinkedList<>();
            for(int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    res.add(1);
                else
                    res.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            result.add(res);
            System.out.println(res);
        }

    return result;

    }
}