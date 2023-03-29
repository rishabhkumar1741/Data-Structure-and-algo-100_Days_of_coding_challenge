package Day_97_Valid_Parentheses;
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> obj = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                if(!obj.isEmpty() && obj.peek()=='(')
                {
                    obj.pop();
                }else{
                    obj.push(s.charAt(i));
                }

            }
            else if(s.charAt(i)==']')
            {
                if(!obj.isEmpty() && obj.peek()=='[')
                {
                    obj.pop();
                }else{
                    obj.push(s.charAt(i));
                }

            }
            else if(s.charAt(i)=='}')
            {
                if(!obj.isEmpty() && obj.peek()=='{')
                {
                    obj.pop();
                }else{
                    obj.push(s.charAt(i));
                }
            }
            else{
                obj.push(s.charAt(i));
            }
            
        }
        return obj.isEmpty();
    }
}
public class Day_97_Valid_Parentheses {
  
   
    
    public static void main(String[] args) {

        
    }
    
}
