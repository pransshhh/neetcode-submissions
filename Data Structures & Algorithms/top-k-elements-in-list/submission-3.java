class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for(int val : nums) map.put(val, map.getOrDefault(val, 0) + 1);

        Queue<Integer> pq = new PriorityQueue((a, b) -> map.get(a) - map.get(b));

        for(int key: map.keySet()) {
            pq.offer(key);
            if(pq.size() > k) pq.poll();
        }

        int[] ans = new int[k];
        while(pq.size() > 0) ans[--k] = pq.poll();

        return ans;
    }
}
