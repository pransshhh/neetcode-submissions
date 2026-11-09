class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for(int val : nums) map.put(val, map.getOrDefault(val, 0) + 1);

        List<int[]> list = new ArrayList();
        for(int key : map.keySet()) {
            list.add(new int[]{key, map.get(key)});
        }

        list.sort((a, b) -> b[1] - a[1]);

        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = list.get(i)[0];
        }

        return ans;
    }
}
