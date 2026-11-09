class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();

        for(String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);
            if(map.containsKey(key)) {
                List<String> curr = map.get(key);
                curr.add(s);
            } else {
                List<String> newList = new ArrayList();
                newList.add(s);
                map.put(key, newList);
            }
        }

        return new ArrayList(map.values());
    }
}
