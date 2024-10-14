class Solution {
    public int strStr(String haystack, String needle) {
        
        char[] needle1 = needle.toCharArray();
        char[] haystack1 = haystack.toCharArray();
        
        int i = 0;
        int j = 0;
        int max = needle1.length - 1;
        int fact = 0;
        
        while(i < haystack1.length) {
            if(haystack1[i] == needle1[j])
            {
                ++j;
                if(j == 1)
                    fact = i;
            }
            else if(j != 0)
            {
                i = fact;
                j = 0;
            }

            if(j == max + 1)
            {
                return i - max;
            }
            i++;
        }
        return -1;
        
    }
}