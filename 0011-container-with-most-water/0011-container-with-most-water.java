class Solution {
    public int maxArea(int[] height) {
        
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        int val = 0;
        
        while(i < j) {
            val = Math.min(height[i], height[j]) * (j - i);
            if(val > max)
                max = val;
            else if(height[i] <= height[j])
                i++;
            else 
                j--;
        }
        return max;
        
    }
}