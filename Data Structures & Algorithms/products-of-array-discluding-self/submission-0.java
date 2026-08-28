class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];

        int prefixProduct = 1;
        int postfixProduct = 1;
        prefix[0] = 1;
        postfix[nums.length-1] = 1;

        for(int i = 1; i < nums.length; i++){
            prefix[i] = nums[i-1] * prefix[i-1];
        }

        System.out.println(Arrays.toString(prefix));

        for(int i = nums.length-2; i >= 0; i--){
            postfix[i] = postfix[i+1] * nums[i+1];
        }
        System.out.println(Arrays.toString(postfix));
        int[] result = new int[nums.length];

        for(int i = 0; i < result.length; i++){    
            result[i] = prefix[i] * postfix[i];
        }

        return result;

    }
}  
