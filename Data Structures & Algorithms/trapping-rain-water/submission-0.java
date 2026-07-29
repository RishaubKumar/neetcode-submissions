class Solution {
    public int trap(int[] height) {
        int lh[] = new int[height.length];
        int rh[] = new int[height.length];
        int trappedWater = 0;

        lh[0] = height[0];
        rh[height.length-1] = height[height.length-1];

        for(int i =1;i<height.length;i++){
            lh[i] = Math.max(lh[i-1],height[i]);
        }
        for(int i =height.length-2;i>=0;i--){
            rh[i] = Math.max(rh[i+1],height[i]);
        }
        for(int i =0;i<height.length;i++){
        int waterLevel = Math.min(lh[i],rh[i]);
        trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
}
