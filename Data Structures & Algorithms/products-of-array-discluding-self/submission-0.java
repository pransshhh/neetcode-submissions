class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        int zeroCnt = 0;
        int prd = 1;
        for(int val : nums) {
            if(val == 0) zeroCnt++;
            else prd *= val;

            if(zeroCnt >= 2) return ans;
        }

        if(zeroCnt == 1) {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) ans[i] = prd;
            }

            return ans;
        }

        for(int i = 0; i < nums.length; i++) {
            ans[i] = prd / nums[i];
        }
        return ans;
    }
}  
