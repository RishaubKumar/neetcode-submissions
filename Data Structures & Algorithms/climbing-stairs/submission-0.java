class Solution {
    public int climbStairs(int n) {
        int[] f = new int[n+1];
        return totalClimb(n,f);

    }
    public int totalClimb(int n, int[] f){
        if(n == 1 || n== 2){
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        f[n] = totalClimb(n-1,f) +totalClimb(n-2,f);
        return f[n];
    }
}
