class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), size = 0;
        int[] freq = new int[256];

        int i = 0, j = 0;
        while(j < n) {
            char ch = s.charAt(j);
            if(freq[ch] == 0) {
                freq[ch]++;
                j++;
            } else {
                while(freq[ch] > 0) {
                    char rem = s.charAt(i);
                    freq[rem]--;
                    i++;
                }
            }
            size = Math.max(size, j - i);
        }
        return size;
    }
}
