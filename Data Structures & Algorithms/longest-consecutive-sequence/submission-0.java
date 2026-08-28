class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(); 
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int lseq = 0;
        for(int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - 1))
                continue;
            else {
                int curr = nums[i];
                int seq = 0;
                while(set.contains(curr)) {
                    seq++;
                    curr++;
                }
                if (lseq < seq)
                    lseq = seq;
            }
        }
        return lseq;
    
    }
}
