class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, one = 0, two = 0;
        for(int num:nums){
            switch(num){
                case 0:
                 zero++;
                 break;
                case 1:
                one++;
                break;
                case 2:
                two++;
                break;
            }
        }
        int idx=0;
        while(zero>0){
            nums[idx++]=0;
            zero--;
        }
        while(one>0){
            nums[idx++]=1;
            one--;
        }
        while(two>0){
            nums[idx++]=2;
            two--;
        }
    }
}