class Solution {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;

        for(int i = 0; i < n; i++) {
            int lg = 0;
            for(int j = i - 1; j >= 0; j--) {
                lg = Math.max(lg, height[j]);
            }

            int rg = 0;
            for(int j = i + 1;j < n; j++) {
                rg = Math.max(rg, height[j]);
            }

            int amt = Math.min(lg, rg) - height[i];

            if(amt > 0) water += amt;
        }

        return water;
    }
}
