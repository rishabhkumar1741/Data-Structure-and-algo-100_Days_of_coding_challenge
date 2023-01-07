package Day_53_Cells_in_a_Range_on_an_Excel_Sheet;
import java.util.*;
public class Day_53_Cells_in_a_Range_on_an_Excel_Sheet {
    public static void main(String[] args) {
        String s = "K1:L2";
        List<String> list=new ArrayList<String>(); 
        char start = s.charAt(0);
        char end = s.charAt(3);
        while(start<=end)
        {
            for(int i=Character.getNumericValue(s.charAt(1));i<=Character.getNumericValue(s.charAt(4));i++)
            {
                list.add(start+""+i);
            }
            start++;
        }
        
        
        
    }
    
}
