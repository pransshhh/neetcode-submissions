class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        char dlmt = '@';
        for(String s : strs) {
            int size = s.length();
            sb.append(size);
            sb.append(dlmt);
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList();
        char dlmt = '@';
        int i = 0;
        while(i < str.length()) {
            int size = 0;

            while(i < str.length() && str.charAt(i) != dlmt) {
                size = (size * 10) + (str.charAt(i) - '0');
                i++;
            }
            i++;

            res.add(str.substring(i, i + size));
            i += size;
        }
        return res;
    }
}
