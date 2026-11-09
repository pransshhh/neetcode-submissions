class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList();

        int n = strs.length;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
            List<String> curr = new ArrayList();
            curr.add(strs[i]);
            if(visited[i] == true) continue;
            visited[i] = true;
            for(int j = i + 1; j < n; j++) {
                if(isAnagram(strs[i], strs[j])) {
                    curr.add(strs[j]);
                    visited[j] = true;
                }
            }
            list.add(curr);
        }
        return list;
    }

    private boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;

        int[] freq = new int [26];
        int n = a.length();
        for(int i = 0; i < n; i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        for(int val : freq) {
            if(val != 0) return false;
        }

        return true;
    }
}
