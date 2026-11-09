class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> hmS = new HashMap();
        Map<Character, Integer> hmT = new HashMap();

        for(int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);
            hmS.put(chS, hmS.getOrDefault(chS, 0) + 1);
            hmT.put(chT, hmT.getOrDefault(chT, 0) + 1);
        }

        return hmS.equals(hmT);
    }
}
