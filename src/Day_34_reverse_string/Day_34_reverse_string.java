package Day_34_reverse_string;

  


public class Day_34_reverse_string {
    public void reverseString(char[] s) {
        
        for(int i =0 ;i<(s.length/2);i++)
        {
            char end = s[s.length-1-i];
            s[s.length-1-i] = s[i];
            s[i] = end;
            
        }
        
    }
    public static void main(String[] args) {
        

    }
    
}
