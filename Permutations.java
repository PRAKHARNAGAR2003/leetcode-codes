class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>(); 
       if(nums == null && nums.length == 0)
            return ans;
        traceback(nums, ans, new ArrayList<Integer>());
        return ans;
    }
    public static void traceback(int[] nums, List<List<Integer>> ans, List<Integer> list){
        if(list.size() == nums.length)
            ans.add(new ArrayList<Integer>(list));
        else{
            for(int i = 0; i < nums.length; i++){
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                    traceback(nums, ans, list);
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}
