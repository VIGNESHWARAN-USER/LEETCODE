class Solution {
    public boolean canJump(int[] nums) {
        int index = nums.length-1;
        while(index !=0)
        {
            for(int i=index-1; i>=0; i--)
            {
                if(i+nums[i] >= index)
                {
                    index = i;
                    break;
                }
                else if(i==0)
                {
                    index = 0;
                    return false;
                }
            }
        }
        return true;
    }
}
