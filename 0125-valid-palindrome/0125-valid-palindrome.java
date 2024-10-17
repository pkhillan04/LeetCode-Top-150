class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            // Skip non-alphanumeric characters from the front
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            
            // Skip non-alphanumeric characters from the back
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            
            // Compare the valid characters, convert to lowercase
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            
            // Move towards the middle
            i++;
            j--;
        }
        
        return true;
    }
}