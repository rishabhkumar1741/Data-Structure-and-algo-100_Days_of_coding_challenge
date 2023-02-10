package Day_72_Roman_to_Integer;
class Solution {
    public int romanToInt(String s) {
       
        int num =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='I')
            {
                if( i+1<s.length() && s.charAt(i+1)=='V' )
                {
                    num = num+4;
                    i++;
                }
                else if(i+1<s.length() && s.charAt(i+1)=='X')
                {
                    num = num+9;
                    i++;
                }
                else{
                    num = num +1;
                }
            }
            else if(s.charAt(i)=='X')
            {
                if(i+1<s.length() && s.charAt(i+1)=='L')
                {
                    num = num+40;
                    i++;
                }
                else if(i+1<s.length() && s.charAt(i+1)=='C')
                {
                    num = num+90;
                    i++;
                }
                else{
                    num = num +10;
                }
            }
            else if(s.charAt(i)=='C')
            {
                if(i+1<s.length() && s.charAt(i+1)=='D')
                {
                    num = num+400;
                    i++;
                }
                else if(i+1<s.length() && s.charAt(i+1)=='M')
                {
                    num = num+900;
                    i++;
                }
                else{
                    num = num +100;
                }
            }
            else if(s.charAt(i)=='V')
            {
                num = num+5;
            }
            else if(s.charAt(i)=='L')
            {
                num = num+50;
            }
            else if(s.charAt(i)=='D')
            {
                num = num+500;
            }
            else if(s.charAt(i)=='M')
            {
                num = num+1000;
            }

        }
        return  num;

        
    }
}

public class Day_72_Roman_to_Integer {
    
}
