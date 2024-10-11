class Solution {
    public int romanToInt(String s) {
        
        int i = 1;
        int v = 5;
        int x = 10;
        int l = 50;
        int c = 100;
        int d = 500;
        int m = 1000;
        int sum = 0;
        
        char[] arr = s.toCharArray();
        
        for(int j = 0; j < arr.length; j++) {
                        
            switch(arr[j]) {
                case 'I':
                    sum += i;    
                    break;
                case 'V':
                    if(j > 0 && arr[j - 1] == 'I')
                        sum += v - 2*i;
                    else
                        sum += v;
                    break;
                case 'X':
                    if(j > 0 && arr[j - 1] == 'I')
                        sum += x - 2*i;
                    else
                        sum += x;
                    break;
                case 'L':
                    if(j > 0 && arr[j - 1] == 'X')
                        sum += l - 2*x;
                    else
                        sum += l;
                    break;
                case 'C':
                    if(j > 0 && arr[j - 1] == 'X')
                        sum += c - 2*x;
                    else
                        sum += c;
                    break;
                case 'D':
                    if(j > 0 && arr[j - 1] == 'C')
                        sum += d - 2*c;
                    else
                        sum += d;
                    break;
                case 'M':
                    if(j > 0 && arr[j - 1] == 'C')
                        sum += m - 2*c;
                    else
                        sum += m;
                    break;
            }
            
        }
        return sum;
        
    }
}