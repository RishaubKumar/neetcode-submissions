class Solution {
    // public int climbStairs(int n) {
    //     int[] f = new int[n+1];
    //     return totalClimb(n,f);

    // }
    // public int totalClimb(int n, int[] f){
    //     if(n == 1 || n== 2){
    //         return n;
    //     }
    //     if(f[n] != 0){
    //         return f[n];
    //     }
    //     f[n] = totalClimb(n-1,f) +totalClimb(n-2,f);
    //     return f[n];
    // }
    public int climbStairs(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        // dp[1] = 2;
        for(int i = 1;i<=n;i++){
            if(i==1){
                dp[i] = dp[i-1] +0;
            }else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return dp[n];
    }
}
