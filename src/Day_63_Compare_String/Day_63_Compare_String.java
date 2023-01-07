package Day_63_Compare_String;
import java.util.*;
import java.util.Scanner;

public class Day_63_Compare_String{

    public static String sorts(char arr[])
    {
        
       
        char temp;
 
        int i = 0;
        while (i < arr.length) {
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] < arr[i]) {
                   
                    // Comparing the characters one by one
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        
        return new String(arr);

    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = "ABC";
        String y = "CBA";
        if(x.length()!=y.length())
        {
            System.out.print("not same ");
        }

        String newx = sorts(x.toCharArray());
        String newy = sorts(y.toCharArray());

        System.out.println(newx);
        if(newx.equals(newy))
        {
            System.out.println("string are equal");
        }
        else{
            System.out.println("not equal ");
        }


        



    }
}