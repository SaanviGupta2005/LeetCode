class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                str+=s.charAt(i);
            }
        }
        int start = 0;
        int end = str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}