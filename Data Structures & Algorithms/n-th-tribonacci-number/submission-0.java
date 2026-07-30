class Solution {
    public int tribonacci(int n){
        int val[] = new int[n+1];
        Arrays.fill(val,-1);
        return tribonacciSol(n,val);
    }
    public int tribonacciSol(int n ,int[] val) {
        if(n ==0 || n == 1){
            return n;
        }
        if(n < 0){
            return 0;
        }
        if( val[n] != -1){
            return val[n];
        }
        val[n] =  tribonacciSol(n-1,val)+tribonacciSol(n-2,val)+tribonacciSol(n-3,val);
        return val[n];
    }
}