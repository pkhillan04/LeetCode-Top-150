class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> map = new HashMap<>();
        
        if(s.length() != t.length())
            return false;
        
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else
                map.put(s.charAt(i), 1);
        }
        
        for(int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch) - 1);
            }
            else
                return false;
        }
        
        for (Integer value : map.values()) {
            if (value > 0 || value < 0) 
                return false;
        }
        
        return true;
    }
}