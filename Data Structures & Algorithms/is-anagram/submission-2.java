class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            freq[chS - 'a']++;
            freq[chT - 'a']--;
        }

        for(int val : freq) {
            if(val != 0) return false;
        }
        return true;
    }
}
