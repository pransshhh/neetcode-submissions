class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[2500];

        for(int val : nums) freq[val + 1000]++;

        int[] ans = new int[k];
        while(k-- > 0) {
            int maxFreq = 0;
            int curr = -1;
            for(int i = 0; i < 2500; i++) {
                if(freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    curr = i;
                }
            }
            ans[k] = curr - 1000;
            freq[curr] = 0;
        }
        return ans;
    }
}
