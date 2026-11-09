class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();

        for(String s : strs) {
            int[] freq = new int[26];
            char[] ch = s.toCharArray();
            for(char c : ch) {
                freq[c - 'a']++;
            }

            String key = Arrays.toString(freq);
            if(!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
}
