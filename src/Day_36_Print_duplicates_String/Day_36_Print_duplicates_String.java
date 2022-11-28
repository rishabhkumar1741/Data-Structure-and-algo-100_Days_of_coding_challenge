package Day_36_Print_duplicates_String;

import java.util.*;

public class Day_36_Print_duplicates_String {

    public static void main(String[] args) {
        String name=  "Rishabh Kumar";
        char []newarr = name.toCharArray();
        Arrays.sort(newarr);
        for (int i = 1; i < newarr.length; i++) {
            if(newarr[i-1]==newarr[i])
            {
                System.out.print(newarr[i]+" ");
                while( i<newarr.length && newarr[i-1]==newarr[i] )
                {
                    i++;
                }
            }
        }

        

    }

}
