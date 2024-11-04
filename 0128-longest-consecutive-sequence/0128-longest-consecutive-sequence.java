class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            int count = 0;
            int j = nums[i];
            
            if(hs.contains(j - 1))
                continue;
            
            while(hs.contains(j)) {
                j++;
                count++;
            }
            
            ans = Math.max(ans, count);
        }
        return ans;
        
    }
}