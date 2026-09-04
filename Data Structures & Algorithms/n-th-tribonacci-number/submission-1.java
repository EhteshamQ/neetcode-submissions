class Solution {
    public int tribonacci(int n) {
        if(n <= 2)
            return n == 0 ? 0 : 1;
        int n0 = 0;
        int n1= 1;
        int n2 = 1;
        int temp;
        for(int i = 3; i <=n ; i++) {
            temp = n2;
            n2 = n0 + n1 + n2;
            n0= n1;
            n1 = temp;


        }
        // System.out.println(Arrays.toString(dp));
        return n2; 
    }
}