
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int len = 0;
        for(int i = 0; i< nums.length; i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0) + 1);
        }
        int[] ans = new int[k];
        int j = 0;
        while(k > 0){
            int max = 0;
            int maxValue = Integer.MIN_VALUE;
            for(int i : mp.keySet()){
                if(mp.get(i)>max){
                    maxValue = i;
                    max = mp.get(i);
                }
            }
            mp.remove(maxValue);
            ans[j++] = maxValue;
            k--;
        }
        return ans;    
    }
}