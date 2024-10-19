class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            if(sum >= target)
            {
                result = Math.min(i + 1 - left, result);
                left++;
                sum = 0;
                i = left - 1;
            }
        }
        
        if(result > nums.length)
            return 0;
        return result;
        
    }
}