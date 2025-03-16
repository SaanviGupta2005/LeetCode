class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        HashSet<String> res = new HashSet<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(words[i].contains(words[j]) && i!=j){
                    res.add(words[j]);
                }
            }
        }
        for(String word:res){
            ans.add(word);
        }
        return ans;
    }
}