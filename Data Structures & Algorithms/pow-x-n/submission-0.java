class Solution {
    public double myPow(double x, int n) {
        if( n ==0){
            return 1;
        }
        if(n>0)
            return pow(x,n);
        else
            return 1/pow(x,-n);
    }
    public double pow(double x, int n){
        if(n == 1){
            return x;
        }
        return x*pow(x,n-1);
    }
}