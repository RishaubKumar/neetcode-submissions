class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> vis = new HashSet<>();
        while(!vis.contains(n)){
            vis.add(n);
            n = sum(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    public int sum(int n){
        int out = 0;
        while(n>0){
            int digit = n%10;
            digit = digit*digit;
            out += digit;
            n/= 10;
        }
        return out;
    }
}
