class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int i: nums)
        {
            arr.add(i);
        }
        int longest = 0;
        for(int i: arr)
        {
            int cnt = 1;
            if(!arr.contains(i-1))
            {
                while(arr.contains(i+1))
                {
                    cnt++;
                    i++;
                }
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}