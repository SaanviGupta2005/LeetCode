class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> st = new HashSet<>();
            for(int j=i;j<s.length();j++){
                if(!st.contains(s.charAt(j))){
                    st.add(s.charAt(j));
                    maxlen = Math.max(maxlen,j-i+1);
                }
                else{
                    break;
                }
            }
        }
        return maxlen;
    }
}