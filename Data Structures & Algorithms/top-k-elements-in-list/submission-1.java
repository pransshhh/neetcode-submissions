class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for(int val : nums) map.put(val, map.getOrDefault(val, 0) + 1);

        int[] ans = new int[k];
        int curr = -1;
        while(k-- > 0) {
            int maxFreq = 0;
            for(int i : map.keySet()) {
                int f = map.get(i);
                if(f > maxFreq) {
                    maxFreq = f;
                    curr = i;
                }
            }
            ans[k] = curr;
            map.put(curr, 0);
        }
        return ans;
    }
}
