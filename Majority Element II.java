class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int el1 = Integer.MIN_VALUE,  el2 = Integer.MIN_VALUE, cnt1 = 0, cnt2 = 0, n = nums.length;
        for(int i=0; i<n; i++)
        {
            if(el2 != nums[i] && cnt1 ==0)
            {
                el1 = nums[i];
                cnt1 = 1;
            }
            else if(el1 != nums[i] && cnt2 == 0)
            {
                el2 = nums[i];
                cnt2 = 1;
            }
            else if(el1 == nums[i]) cnt1++;
            else if(el2 == nums[i]) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> ls = new ArrayList<>(); 
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) cnt1++;
            if (nums[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);
        return ls;
    }
}