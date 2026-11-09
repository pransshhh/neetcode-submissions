class Solution {
    public int maxArea(int[] heights) {
        int area = 0;

        int i = 0, j = heights.length - 1;

        while(i < j) {
            int length = j - i, height = Math.min(heights[i], heights[j]);
            area = Math.max(area, length * height);

            if(heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }

        return area;
    }
}
