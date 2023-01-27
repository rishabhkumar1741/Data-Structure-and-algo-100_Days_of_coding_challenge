package Day_71_Decode_the_Message;
import java.util.*;
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> obj = new HashMap<>();
        String data = "";
        char abc = 97;
        for(int i=0;i<key.length();i++)
        {
            if(key.charAt(i)==' ')
            {
                continue;
            }
            else
            {
                if(!obj.containsKey(key.charAt(i)))
                {
                    obj.put(key.charAt(i),abc);
                    abc++;
                }
            }
        }
        for(int i =0;i<message.length();i++)
        {
            if(message.charAt(i)==' ')
            {
                data= data+" ";
            }
            else{
                data= data+obj.get(message.charAt(i));
            }
        }
        return data;
        
    }
}

public class Day_71_Decode_the_Message {
    
}
