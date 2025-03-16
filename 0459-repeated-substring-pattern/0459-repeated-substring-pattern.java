class Solution {
    public boolean repeatedSubstringPattern(String s) {
        //doubled = abababab
        //sub = bababa (Remove 1st, Last Character)
        //bababa contains abab => True
        String doubled = s+s;
        String sub = doubled.substring(1,doubled.length()-1);
        return sub.contains(s);
    }
}