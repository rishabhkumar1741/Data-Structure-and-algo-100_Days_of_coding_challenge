package Day_49_Defanging_an_IP_Address;
class Solution {
    public String defangIPaddr(String address) {
        String newstr="";
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)!='.')
            {
                newstr = newstr+""+address.charAt(i);
            }
            else{
                newstr = newstr+"[.]";
            }
        }
        return newstr;
        
    }
}

public class Day_49_Defanging_an_IP_Address {
    
}
