class Solution {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;

        int lMax = 0, rMax = 0;
        int l = 0, r = n - 1;

        while(l <= r) {
            if(lMax <= rMax) {
                lMax = Math.max(lMax, height[l]);
                water += lMax - height[l];
                l++;
            } else {
                rMax = Math.max(rMax, height[r]);
                water += rMax - height[r];
                r--;
            }
        }

        return water;
    }
}
