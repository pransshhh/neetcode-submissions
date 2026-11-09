class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < n; i++) {
            int val = target - nums[i];
            if(map.containsKey(val)) {
                int fi = map.get(val);
                return new int[]{fi, i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
