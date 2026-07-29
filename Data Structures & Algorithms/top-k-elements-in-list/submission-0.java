class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        int ans[] = new int[max - min + 1];
        for (int i = 0; i < nums.length; i++) {
            ans[nums[i] - min]++;
        }

        int result[] = new int[k];
        int idx = 0;

        while (idx < k) {
            int maxFreq = 0;
            int maxIndex = 0;

            for (int i = 0; i < ans.length; i++) {
                if (ans[i] > maxFreq) {
                    maxFreq = ans[i];
                    maxIndex = i;
                }
            }

            result[idx++] = maxIndex + min; 
            ans[maxIndex] = 0; 
        }

        return result;
    }
}
