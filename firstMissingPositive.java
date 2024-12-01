class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int index = 0, ans=1;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i] == 1)
            {
                index = i;
            }
        }
        if(nums[index] != 1)
        {
            return 1;
        }
        for(int i = index; i< nums.length; i++)
        {
            if(nums[i] == ans)
                ans++;
        }
        return ans;
    }
}
