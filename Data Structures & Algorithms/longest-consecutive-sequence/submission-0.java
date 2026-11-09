class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int max = 0;
        int len = 1;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) continue;
            if(nums[i] == nums[i - 1] + 1) {
                len++;
            } else {
                len = 1;
            }

            max = Math.max(max, len);
        }

        return Math.max(max, len);
    }
}
