class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();

        createSubset(nums,l, list,0);
        return list;

    }
    public void createSubset(int[] nums, List<Integer> list,List<List<Integer>> ans, int i ){
        if(i == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        //recursion
        // yes choice
        list.add(nums[i]);
        createSubset(nums, list, ans, i+1);
        // Backtracking and removing choice
        list.remove(list.size()-1);
        // no choice
        createSubset(nums,list, ans, i+1);
    }
}
