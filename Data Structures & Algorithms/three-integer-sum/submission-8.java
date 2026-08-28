class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        Arrays.sort(nums);
        Set<Integer> seen = new HashSet<>();
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length-2 ; i++) {
            if (seen.contains(nums[i]))
                continue;
            
            int j = i+1 , k = nums.length - 1;
            
            while(j < nums.length && k > j) {
                System.out.println(nums[i]+ nums[j] + nums[k]);
                if (nums [i] +  (nums[j] + nums[k]) > 0)
                {
                    k--;
                }
                else if ( nums[i] + (nums[j] + nums[k]) < 0) {
                    j++;
                }
                else  {
                    var list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    j++;
                    k--;
                    set.add(list);
                    
                }
            }
            seen.add(nums[i]);

        }
        return new LinkedList(set);
    }
}
