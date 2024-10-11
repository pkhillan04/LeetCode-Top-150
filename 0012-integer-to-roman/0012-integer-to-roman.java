class Solution {
    public String intToRoman(int num) {
        
        int i = 1;
        int v = 5;
        int x = 10;
        int l = 50;
        int c = 100;
        int d = 500;
        int m = 1000;
        int temp = 0;
        int input = num;
        String str = "";
        
        // while(input > 0) {
        //     if(input >= m - c) 
        //     {
        //         if(input < m)
        //         {
        //             str += "CM";
        //             input = input % c;
        //         }
        //         else
        //         {
        //             temp = input / m;
        //             str += String.valueOf('M').repeat(temp);
        //             input = input % m;
        //         }
        //     }
        //     else if(input >= d - c)
        //     {
        //         temp = input / d;
        //         str += String.valueOf('D').repeat(temp);
        //         input = input % d;
        //     }
        //     else if(input >= c - x)
        //     {
        //         temp = input / c;
        //         str += String.valueOf('C').repeat(temp);
        //         input = input % c;
        //     }
        //     else if(input >= l - x)
        //     {
        //         temp = input / l;
        //         str += String.valueOf('L').repeat(temp);
        //         input = input % l;
        //     }
        //     else if(input >= x - i)
        //     {
        //         temp = input / x;
        //         str += String.valueOf('X').repeat(temp);
        //         input = input % x;
        //     }
        //     else if(input >= v - i)
        //     {
        //         temp = input / v;
        //         str += String.valueOf('V').repeat(temp);
        //         input = input % v;
        //     }
        //     else 
        //     {
        //         temp = input / i;
        //         str += String.valueOf('I').repeat(temp);
        //         input = input % i;
        //     }
        // }
        
        while(input > 0) {
            if(input >= m - c) 
            {
                if(input < m)
                {
                    str += "CM";
                    input = input % c;
                }
                else
                {
                    str += 'M';
                    input = input - m;
                }
            }
            else if(input >= d - c)
            {
                if(input < d)
                {
                    str += "CD";
                    input = input % c;
                }
                else 
                {
                    str += 'D';
                    input = input - d;
                }
            }
            else if(input >= c - x)
            {
                if(input < c)
                {
                    str += "XC";
                    input = input % x;
                }
                else
                {
                    str += 'C';
                    input = input - c;
                }
            }
            else if(input >= l - x)
            {
                if(input < l)
                {
                    str += "XL";
                    input = input % x;
                }
                else
                {
                    str += 'L';
                    input = input - l;
                }
            }
            else if(input >= x - i)
            {
                if(input < x)
                {
                    str += "IX";
                    input = input % i;
                }
                else
                {
                    str += 'X';
                    input = input - x;
                }
            }
            else if(input >= v - i)
            {
                if(input < v)
                {
                    str += "IV";
                    input = input % i;
                }
                else
                {
                    str += 'V';
                    input = input - v;
                }
            }
            else 
            {
                str += 'I';
                input = input - i;
            }
        }
        
        return str;
    }
}