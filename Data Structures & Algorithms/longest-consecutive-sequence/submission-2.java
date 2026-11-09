class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Set<Integer> set = new HashSet();
        for(int val : nums) set.add(val);

        int len = 0;
        for(int val : set) {
            if(set.contains(val - 1)) continue;
            else {
                int curr = 1;
                while(set.contains(++val)) curr++;
                len = Math.max(len, curr);
            }
        }

        return len;
    }
}
