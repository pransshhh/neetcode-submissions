class Solution {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;

        int[] lg = new int[n];
        int[] rg = new int[n];

        for(int i = 1; i < n; i++) {
            lg[i] = Math.max(lg[i - 1], height[i - 1]);
        }

        for(int i = n - 2; i >= 0; i--) {
            rg[i] = Math.max(rg[i + 1], height[i + 1]);
        }

        for(int i = 0; i < n; i++) {
            int amt = Math.min(lg[i], rg[i]) - height[i];
            if(amt > 0) water += amt;
        }

        return water;
    }
}
