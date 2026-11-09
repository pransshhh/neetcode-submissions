class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap();
        for(int val : nums) map.put(val, map.getOrDefault(val, 0) + 1);

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(int i = 0; i <= n; i++) bucket[i] = new ArrayList();

        for(int key : map.keySet()) {
            int freq = map.get(key);
            bucket[freq].add(key);
        }

        int[] ans = new int[k];
        for(int i = n; i >= 0; i--) {
            for(int j = 0; j < bucket[i].size(); j++) {
                ans[--k] = bucket[i].get(j);
                if(k == 0) return ans;
            }
        }

        return ans;
    }
}
