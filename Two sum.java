class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sol[]={0,0};
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    sol[0]=i;
                    sol[1]=j;
                    break;
                }
            }
        }
        return sol;
    }
}
