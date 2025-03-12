class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        int cnt=0;
        int one=0;
        for (int freq : mp.values()) {
            if (freq % 2 == 0) {
                cnt += freq;
            }
            else {
                cnt += freq - 1;
                one++;
            }
        }
        if(one>=1){
            cnt+=1;
        }
        return cnt;
    }
}