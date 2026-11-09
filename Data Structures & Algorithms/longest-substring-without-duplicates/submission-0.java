class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), size = 0;
        for(int i = 0; i < n; i++) {
            Set<Character> set = new HashSet();
            for(int j = i; j < n; j++) {
                char ch = s.charAt(j);
                if(set.contains(ch)) {
                    break;
                }

                set.add(ch);
            }
            size = Math.max(size, set.size());
        }
        return size;
    }
}
